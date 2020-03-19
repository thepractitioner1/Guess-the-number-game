package academy.learnprogramming.config;

import academy.learnprogramming.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(GameConfig.class)
@ComponentScan(basePackages = "academy.learnprogramming")
public class AppConfig {
    //Bean Method

    @Bean
    public NumberGenerator numberGenerator(){
        return new NumberGeneratorimpl();
    }

    @Bean
    public Game game(){
        return new Gameimpl();
    }

    @Bean
    public MessageGenerator messageGenerator(){
        return new MessageGeneratorImpl();
    }
}
