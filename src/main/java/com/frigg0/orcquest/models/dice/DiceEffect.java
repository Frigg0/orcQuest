package com.frigg0.orcquest.models.dice;

public class DiceEffect {
    // Variables declarations
    private Enum<Face> diceEffect;

    // Constructors
    public DiceEffect(Enum<Face> diceEffect) {
        this.diceEffect = diceEffect;
    }

    public DiceEffect() {
        // empty constructor on purpose
    }

    // toString
    @Override
    public String toString() {
        return "DiceEffect{" +
                "diceEffect='" + diceEffect + '\'' +
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
    public Enum<Face> getDiceEffect() {
        return diceEffect;
    }

    public void setDiceEffect(Enum<Face> diceEffect) {
        this.diceEffect = diceEffect;
    }
}
