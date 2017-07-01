package com.example.user.fruitmachine;

import java.util.ArrayList;
import java.util.Random;

import static android.R.attr.value;
import static android.media.CamcorderProfile.get;

/**
 * Created by user on 30/06/2017.
 */

public class Machine {

    ArrayList<Symbol> wheel;
    ArrayList<Symbol> result;

    private int money;
    private Random random;
    Printer printer;
    Player player;


    public Machine(int money) {
        wheel = new ArrayList<>();
        result = new ArrayList<>();
        this.money = money;
        player = new Player(20);
        random = new Random();
        printer = new Printer();
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Symbol> populateBarrel() {
        for (Symbol cherry : Symbol.values()) {
            wheel.add(cherry);
        }
        return wheel;
}


    public void spinWheel() {
        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(wheel.size());
            Symbol symbol = wheel.get(index);
            System.out.println(symbol);
            result.add(symbol);
        }if ((result.get(0).value == result.get(1).value) && (result.get(0).value == result.get(2).value)) {
            jackpot();
        }else{
            addToJackpot();}

    }

    public void addToJackpot(){
        this.money += 1;
    }


    private void jackpot() {
        System.out.println("Jackpot!");
        int prize = (result.get(0).value * 3);
        System.out.println("You have won £" + prize + "!");
        System.out.println("The JackPot now stands at" + (money - prize));
    }
}
