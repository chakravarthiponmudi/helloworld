package com.chakraonjjava.HelloWorld;


import com.springinaction.knights.BraveKnight;

import com.springinaction.knights.Knight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    String sayHello() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(com.springinaction.knights.config.KnightConfig.class);
//        ctx.refresh();

        Knight myKnight = (BraveKnight)ctx.getBean("knight");
        myKnight.embarkOnQuest();
        ctx.close();
        return "Hello World!!!";
    }
}