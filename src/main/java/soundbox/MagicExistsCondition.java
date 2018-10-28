package soundbox;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();
        System.out.println("Environemnts printing");
        System.out.println(env);
        System.out.println("BeanFactory");
        ConfigurableListableBeanFactory bf = context.getBeanFactory();
        System.out.println(context.getBeanFactory());
        return true;
    }
}
