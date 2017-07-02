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


    public Machine(int money) {
        wheel = new ArrayList<>();
        result = new ArrayList<>();
        this.money = money;
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

    public void spinWheel(){
        random = new Random();
        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(wheel.size());
            Symbol symbol = wheel.get(index);
            System.out.println(symbol);
            result.add(symbol);
        }if ((result.get(0).value == result.get(1).value) &&
                (result.get(0).value == result.get(2).value)) {
            jackpot();

        }else if((result.get(0).value == result.get(1).value) &&
                (result.get(0).value != result.get(2).value)){
            nudgeRight();
        }else if((result.get(1).value == result.get(2).value) &&
                (result.get(1).value != result.get(0).value))
        {
            nudgeLeft();
        }else if((result.get(0).value == result.get(2).value) &&
                (result.get(0).value != result.get(1).value)) {
            nudgeCenter();
        }
        else {
            addToJackpot();}
    }

    public void addToJackpot(){
        this.money += 1;
    }

    public void jackpot() {
        System.out.println("Jackpot!");
        int prize = (result.get(0).value * 3);
        System.out.println("You have won £" + prize + "!");
        System.out.println("The JackPot now stands at £" + (money -= prize));
    }

    public Symbol nudgeLeft(){
        System.out.println("You can nudge " + result.get(0));
        int index = random.nextInt(result.size());
        Symbol symbol = result.get(index);
        System.out.println("New nudge is: " + symbol);
        result.remove(0);
        result.add(0, symbol);
        if ((result.get(0).getValue() == result.get(1).getValue()) &&
                (result.get(0).getValue() == result.get(2).getValue())) {
            jackpot();

        }else{
            addToJackpot();
        }
        return symbol;
    }

    public Symbol nudgeCenter(){
        System.out.println("You can nudge " + result.get(1));
        int index = random.nextInt(result.size());
        Symbol symbol = result.get(index);
        System.out.println("New nudge is: " + symbol);
        result.remove(1);
        result.add(1, symbol);
        if ((result.get(0).getValue() == result.get(1).getValue()) &&
                (result.get(0).getValue() == result.get(2).getValue())) {
            jackpot();

        }else{
            addToJackpot();
        }return symbol;
    }

    public Symbol nudgeRight(){
        System.out.println("You can nudge " + result.get(2));
        int index = random.nextInt(result.size());
        Symbol symbol = result.get(index);
        System.out.println("New nudge is: " + symbol);
        result.remove(2);
        result.add(2, symbol);
        if ((result.get(0).getValue() == result.get(1).getValue()) &&
                (result.get(0).getValue() == result.get(2).getValue())) {
            jackpot();

        }else{
            addToJackpot();
        }return symbol;
    }
}
