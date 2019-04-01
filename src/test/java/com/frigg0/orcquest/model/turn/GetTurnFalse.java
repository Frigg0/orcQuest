package com.frigg0.orcquest.model.turn;

import com.frigg0.orcquest.models.turn.Turn;
import org.junit.Assert;
import org.junit.Test;

public class GetTurnFalse {
    @Test
    public static void getTurnFalse(){
        Turn turn = new Turn();

        Assert.assertNotEquals("On doit se trouver au tour 1 à l'instanciation", 2, turn.getTurn());
        Assert.assertNotEquals("On doit se trouver au tour 1 à l'instanciation", 0, turn.getTurn());
    }
}
