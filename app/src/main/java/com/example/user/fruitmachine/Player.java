package com.example.user.fruitmachine;

/**
 * Created by user on 30/06/2017.
 */

public class Player {

    private int credits;
    Printer printer;

    public Player(int credits) {
        this.credits = credits;
        printer = new Printer();

    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }



    public void minusCredit() {
        credits -= 1;
    }
}

