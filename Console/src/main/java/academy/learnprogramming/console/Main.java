package academy.learnprogramming.console;

import academy.learnprogramming.config.GameConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {



    public static void main(String[] args) {
        log.info("Guess the number game: ");

        // CREATE CONTEXT(CONTAINER)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);



        //close context
        context.close();

    }
}
