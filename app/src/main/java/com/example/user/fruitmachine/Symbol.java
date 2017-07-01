package com.example.user.fruitmachine;

/**
 * Created by user on 30/06/2017.
 */

public enum Symbol {
    CHERRIES(1),
    PINEAPPLES(2),
    LUCKY7(5),
    GOLDBARS(10);

    int value;

    Symbol(int value) {
         this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
