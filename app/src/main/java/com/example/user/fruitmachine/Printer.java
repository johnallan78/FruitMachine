package com.example.user.fruitmachine;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 30/06/2017.
 */

public class Printer {

    ArrayList<String>cheekyAnswers;
    Random random;

    public void notEnoughFunds(){
        System.out.println ("Sorry, insufficient funds. ");
    }

    public void playGame() {
        System.out.println("Would you like to play?(y/n) ");
    }

    public void playGameAgain() {
        System.out.println("Would you like to play again?(y/n) ");
    }

    public void cheekyAnswer() {
        cheekyAnswers.add("OK, maybe some other time!");
        cheekyAnswers.add("That's a shame. Was it my big cherries that attracted you in the first place?");
        cheekyAnswers.add("Probably for the best. You've had a few and I don't want to rinse you.");
        int index = random.nextInt(cheekyAnswers.size());
        String cheekyString = cheekyAnswers.get(index);
        System.out.println(cheekyString);
    }
}
