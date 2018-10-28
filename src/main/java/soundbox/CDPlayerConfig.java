package soundbox;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan;


@Configuration
@ComponentScan()
public class CDPlayerConfig {

//    @Bean
////    @Qualifier("Devotional")
//    public CDPlayer cdPlayer(CompactDisc cd) {
//        CDPlayer cdPlayer = new CDPlayer();
//        cdPlayer.SetCDPlayer(cd);
//        return cdPlayer;
//    }
//
    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }

}