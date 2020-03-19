package academy.learnprogramming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;


public class NumberGeneratorimpl implements NumberGenerator {
    // ==fields==

    private final Random random = new Random();

    @Autowired
    @MaxNumber
    private int maxNumber;



    @Autowired
    @MinNumber
    private int minNumber;

    //== public methods ==
    @Override
    public int next() {
        return random.nextInt(maxNumber + 1 - minNumber) +minNumber;
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }

    @Override
    public int getMinNumber() {
        return minNumber;
    }
}
