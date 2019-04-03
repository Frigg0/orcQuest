package com.frigg0.orcquest.models.dice;

public class DiceThrow {
    // Variables declaration
    private int numberOfDice;
    private DiceColorEnum firstColor;
    private DiceColorEnum secondColor;

    // Constructors
    public DiceThrow(int numberOfDice, DiceColorEnum firstColor, DiceColorEnum secondColor) {
        this.numberOfDice = numberOfDice;
        this.firstColor = firstColor;
        this.secondColor = secondColor;
    }

    public DiceThrow(int numberOfDice, DiceColorEnum firstColor) {
        this.numberOfDice = numberOfDice;
        this.firstColor = firstColor;
    }

    // toString
    @Override
    public String toString() {
        return "DiceThrow{" +
                "numberOfDice=" + numberOfDice +
                ", firstColor=" + firstColor +
                ", secondColor=" + secondColor +
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

    // Getter & Setter
    public int getNumberOfDice() {
        return numberOfDice;
    }

    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public DiceColorEnum getFirstColor() {
        return firstColor;
    }

    public void setFirstColor(DiceColorEnum firstColor) {
        this.firstColor = firstColor;
    }

    public DiceColorEnum getSecondColor() {
        return secondColor;
    }

    public void setSecondColor(DiceColorEnum secondColor) {
        this.secondColor = secondColor;
    }
}
