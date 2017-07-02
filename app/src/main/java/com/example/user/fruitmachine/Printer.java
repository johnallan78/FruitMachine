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

    public void cheekyAnswer() {
        random = new Random();
        cheekyAnswers = new ArrayList<>();
        cheekyAnswers.add("OK, maybe some other time!");
        cheekyAnswers.add("That's a shame. Was it my big cherries that attracted you in the first place?");
        cheekyAnswers.add("Probably for the best. You've had a few and I don't want to rinse you.");
        cheekyAnswers.add("Siri doesn't punch back mate. I do.");
        int index = random.nextInt(cheekyAnswers.size());
        String cheekyString = cheekyAnswers.get(index);
        System.out.println(cheekyString);
    }
}
