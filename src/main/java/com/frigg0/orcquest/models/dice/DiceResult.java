package com.frigg0.orcquest.models.dice;

public class DiceResult {
    // Variables declarations
    private int diceResult;

    // Constructors
    public DiceResult(int diceResult) {
        this.diceResult = diceResult;
    }

    public DiceResult() {
        // empty constructor on purpose
    }

    // toString
    @Override
    public String toString() {
        return "DiceResult{" +
                "diceResult=" + diceResult +
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
    public int getDiceResult() {
        return diceResult;
    }

    public void setDiceResult(int diceResult) {
        this.diceResult = diceResult;
    }
}
