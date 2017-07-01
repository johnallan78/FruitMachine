package com.example.user.fruitmachine;

import java.util.ArrayList;
import java.util.Scanner;

import static android.R.attr.y;

/**
 * Created by user on 30/06/2017.
 */

public class Game {

    Player player;
    Machine machine;
    Printer printer;
    private Scanner sc;

    public Game(){
        player = new Player(20);
        machine = new Machine(50);
        sc = new Scanner(System.in);
        printer = new Printer();
    }

    public void play(){
        System.out.println("The JackPot stands at £" + machine.getMoney() + ".00");
        printer.playGame();
        while (true){
            if (player.getCredits() > 0){
            String answer = sc.nextLine();
            if (answer.equals("y")) {
                machine.populateBarrel();
                player.minusCredit();
                machine.spinWheel();
                System.out.println("You have " + player.getCredits() + " credits left.");
                System.out.println("The JackPot now stands at £" + machine.getMoney() + ".00");
                printer.playGameAgain();
            }else { printer.cheekyAnswer();
                return;
            }
            }else {
                printer.notEnoughFunds();
                return;}
        }
    }
}
