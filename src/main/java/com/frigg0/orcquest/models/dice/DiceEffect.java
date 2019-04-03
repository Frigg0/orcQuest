package com.frigg0.orcquest.models.dice;

public class DiceEffect {
    // Variables declarations
    private Enum<FaceEnum> diceEffect;

    // Constructors
    public DiceEffect(Enum<FaceEnum> diceEffect) {
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
    public Enum<FaceEnum> getDiceEffect() {
        return diceEffect;
    }

    public void setDiceEffect(Enum<FaceEnum> diceEffect) {
        this.diceEffect = diceEffect;
    }
}
