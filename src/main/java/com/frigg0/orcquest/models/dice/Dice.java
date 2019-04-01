package com.frigg0.orcquest.models.dice;

import java.util.HashMap;

public class Dice {
    // Variables declarations
    private String color;
    private HashMap<DiceResult, DiceEffect> resultDiceEffect;

    // Constructors
    public Dice(String color, HashMap<DiceResult, DiceEffect> resultDiceEffect) {
        this.color = color;
        this.resultDiceEffect = resultDiceEffect;
    }

    public Dice() {
        // empty constructor on purpose
    }

    // toString
    @Override
    public String toString() {
        return "Dice{" +
                "color='" + color + '\'' +
                ", resultDiceEffect=" + resultDiceEffect +
                '}';
    }

    // Override methods
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    // Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public HashMap<DiceResult, DiceEffect> getResultDiceEffect() {
        return resultDiceEffect;
    }

    public void setResultDiceEffect(HashMap<DiceResult, DiceEffect> resultDiceEffect) {
        this.resultDiceEffect = resultDiceEffect;
    }
}
