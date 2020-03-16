package academy.learnprogramming.console;

import academy.learnprogramming.AppConfig;
import academy.learnprogramming.Game;
import academy.learnprogramming.MessageGenerator;
import academy.learnprogramming.NumberGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        log.info("Guess the number game: ");

        // CREATE CONTEXT(CONTAINER)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        NumberGenerator numberGenerator =  context.getBean( NumberGenerator.class);

        //call method next() to get a random number

        int number =  numberGenerator.next();

        //log generated number
        log.info("number  = {}", number);

        //get game bean from context( container)
        Game game = context.getBean(Game.class);


        //get MessageGeneratorBean from context(container)
        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);

        log.info(messageGenerator.getMainMessage());
        log.info(messageGenerator.getResultMessage());

        //call reset method
//        game.reset();

        //close context
        context.close();

    }
}
