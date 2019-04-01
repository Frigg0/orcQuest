package com.frigg0.orcquest.models.turn;

public class Turn {
    // Variables declaration
    private int turn = 1;

    // Constructor
    public Turn(int turn) {
        this.turn = turn;
    }

    public Turn() {
        // empty constructor on purpose
    }

    // toString
    @Override
    public String toString() {
        return "Turn{" +
                "turn=" + turn +
                '}';
    }

    // Override
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    // Getter & Setter
    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }
}
