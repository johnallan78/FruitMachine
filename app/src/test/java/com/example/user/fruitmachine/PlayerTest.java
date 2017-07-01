package com.example.user.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 01/07/2017.
 */

public class PlayerTest {

    Player player;
    Machine machine;

    @Before
    public void setUp() throws Exception {
        player = new Player(5);
        machine = new Machine(50);

    }

    @Test
    public void canMinusCredit() throws Exception {
        player.minusCredit();
        assertEquals(4, player.getCredits());
    }
}
