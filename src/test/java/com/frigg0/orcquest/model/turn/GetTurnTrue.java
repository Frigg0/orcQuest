package com.frigg0.orcquest.model.turn;

import com.frigg0.orcquest.models.turn.Turn;
import org.junit.Assert;
import org.junit.Test;

public class GetTurnTrue {
    @Test
    public static void getTurnTrue(){
        Turn turn = new Turn();

        Assert.assertEquals("On doit se trouver au tour 1 à l'instanciation", 1, turn.getTurn());
    }
}
