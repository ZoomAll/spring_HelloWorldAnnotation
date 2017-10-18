package my.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class App
{
    @Bean
    MessageService mockMessageService(){
        return () -> "Hello, world";
    }

    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
        MessagePrinter bean = ctx.getBean(MessagePrinter.class);
        bean.printMessage();
    }
}
