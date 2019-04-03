package com.frigg0.orcquest.models.deck;

import com.frigg0.orcquest.models.cards.Card;

import java.util.List;

public class Deck {
    // Variables declaration
    private List<Card> deckList;

    // Constructors
    public Deck(List<Card> deckList) {
        this.deckList = deckList;
    }

    public Deck() {
    }

    // toString
    @Override
    public String toString() {
        return "Deck{" +
                "deckList=" + deckList +
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

    // Getter and Setter
    public List<Card> getDeckList() {
        return deckList;
    }

    public void setDeckList(List<Card> deckList) {
        this.deckList = deckList;
    }
}
