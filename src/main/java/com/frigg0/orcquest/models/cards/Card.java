package com.frigg0.orcquest.models.cards;

import com.frigg0.orcquest.models.dice.DiceThrow;

public class Card {
    // Variables declarations
    private int id;
    private String name;
    private Enum<CardType> cardType;
    private int successRequired;
    private boolean onlyPlayableLastTurn;
    private int goldReward;
    private int healthReward;
    private CardDebuff cardDebuff;
    private boolean playableOncePerTurn;
    private String cardEffect;
    private DiceThrow diceThrow;

    // Constructors
    public Card(int id, String name, Enum<CardType> cardType, int successRequired,
                boolean onlyPlayableLastTurn, int goldReward, CardDebuff cardDebuff,
                boolean playableOncePerTurn, DiceThrow diceThrow) {
        this.id = id;
        this.name = name;
        this.cardType = cardType;
        this.successRequired = successRequired;
        this.onlyPlayableLastTurn = onlyPlayableLastTurn;
        this.goldReward = goldReward;
        this.cardDebuff = cardDebuff;
        this.playableOncePerTurn = playableOncePerTurn;
        this.diceThrow = diceThrow;
    }

    public Card(int id, String name, Enum<CardType> cardType, boolean onlyPlayableLastTurn,
                int goldReward, boolean playableOncePerTurn) {
        this.id = id;
        this.name = name;
        this.cardType = cardType;
        this.onlyPlayableLastTurn = onlyPlayableLastTurn;
        this.goldReward = goldReward;
        this.playableOncePerTurn = playableOncePerTurn;
    }

    public Card(int id, String name, Enum<CardType> cardType, boolean onlyPlayableLastTurn,
                boolean playableOncePerTurn, String cardEffect) {
        this.id = id;
        this.name = name;
        this.cardType = cardType;
        this.onlyPlayableLastTurn = onlyPlayableLastTurn;
        this.playableOncePerTurn = playableOncePerTurn;
        this.cardEffect = cardEffect;
    }

    public Card(int id, String name, Enum<CardType> cardType, int successRequired,
                boolean onlyPlayableLastTurn, int healthReward,
                boolean playableOncePerTurn, DiceThrow diceThrow) {
        this.id = id;
        this.name = name;
        this.cardType = cardType;
        this.successRequired = successRequired;
        this.diceThrow = diceThrow;
        this.onlyPlayableLastTurn = onlyPlayableLastTurn;
        this.healthReward = healthReward;
        this.playableOncePerTurn = playableOncePerTurn;
    }

    public Card(int id, String name, Enum<CardType> cardType, boolean playableOncePerTurn, String cardEffect) {
        this.id = id;
        this.name = name;
        this.cardType = cardType;
        this.playableOncePerTurn = playableOncePerTurn;
        this.cardEffect = cardEffect;
    }

    // public Card() {
        // empty constructor on purpose.
    //}

    // toString
    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cardType=" + cardType +
                ", successRequired=" + successRequired +
                ", diceThrow=" + diceThrow +
                ", onlyPlayableLastTurn=" + onlyPlayableLastTurn +
                ", goldReward=" + goldReward +
                ", healthReward=" + healthReward +
                ", cardDebuff=" + cardDebuff +
                ", playableOncePerTurn=" + playableOncePerTurn +
                ", cardEffect='" + cardEffect + '\'' +
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

    // Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum<CardType> getCardType() {
        return cardType;
    }

    public void setCardType(Enum<CardType> cardType) {
        this.cardType = cardType;
    }

    public int getSuccessRequired() {
        return successRequired;
    }

    public void setSuccessRequired(int successRequired) {
        this.successRequired = successRequired;
    }

    public DiceThrow getDiceThrow() {
        return diceThrow;
    }

    public void setDiceThrow(DiceThrow diceThrow) {
        this.diceThrow = diceThrow;
    }

    public boolean isOnlyPlayableLastTurn() {
        return onlyPlayableLastTurn;
    }

    public void setOnlyPlayableLastTurn(boolean onlyPlayableLastTurn) {
        this.onlyPlayableLastTurn = onlyPlayableLastTurn;
    }

    public int getGoldReward() {
        return goldReward;
    }

    public void setGoldReward(int goldReward) {
        this.goldReward = goldReward;
    }

    public int getHealthReward() {
        return healthReward;
    }

    public void setHealthReward(int healthReward) {
        this.healthReward = healthReward;
    }

    public CardDebuff getCardDebuff() {
        return cardDebuff;
    }

    public void setCardDebuff(CardDebuff cardDebuff) {
        this.cardDebuff = cardDebuff;
    }

    public boolean isPlayableOncePerTurn() {
        return playableOncePerTurn;
    }

    public void setPlayableOncePerTurn(boolean playableOncePerTurn) {
        this.playableOncePerTurn = playableOncePerTurn;
    }

    public String getCardEffect() {
        return cardEffect;
    }

    public void setCardEffect(String cardEffect) {
        this.cardEffect = cardEffect;
    }
}