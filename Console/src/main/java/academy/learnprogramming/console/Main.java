package academy.learnprogramming.console;

import academy.learnprogramming.config.GameConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        log.info("Guess the number game: ");

        // CREATE CONTEXT(CONTAINER)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);



        //close context
        context.close();

    }
}
