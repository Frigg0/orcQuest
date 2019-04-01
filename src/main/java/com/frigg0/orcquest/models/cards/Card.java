package com.frigg0.orcquest.models.cards;

public class Card {
    // Variables declarations
    private int id;
    private String name;
    private Enum<CardType> cardType;
    private int successRequired;
    private int numberOfTryingDice;
    private boolean onlyPlayableLastTurn;
    private int goldReward;
    private int healthReward;
    private CardDebuff cardDebuff;
    private boolean playableOncePerTurn;
    private String cardEffect;

    // Constructors
    public Card(int id, String name, Enum<CardType> cardType, int successRequired,
                int numberOfTryingDice, boolean onlyPlayableLastTurn, int goldReward,
                CardDebuff cardDebuff, boolean playableOncePerTurn) {
        this.id = id;
        this.name = name;
        this.cardType = cardType;
        this.successRequired = successRequired;
        this.numberOfTryingDice = numberOfTryingDice;
        this.onlyPlayableLastTurn = onlyPlayableLastTurn;
        this.goldReward = goldReward;
        this.cardDebuff = cardDebuff;
        this.playableOncePerTurn = playableOncePerTurn;
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
                int numberOfTryingDice, boolean onlyPlayableLastTurn, int healthReward, boolean playableOncePerTurn) {
        this.id = id;
        this.name = name;
        this.cardType = cardType;
        this.successRequired = successRequired;
        this.numberOfTryingDice = numberOfTryingDice;
        this.onlyPlayableLastTurn = onlyPlayableLastTurn;
        this.healthReward = healthReward;
        this.playableOncePerTurn = playableOncePerTurn;
    }

    public Card() {
        // empty constructor on purpose.
    }

    // toString
    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cardType=" + cardType +
                ", successRequired=" + successRequired +
                ", numberOfTryingDice=" + numberOfTryingDice +
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

    public int getNumberOfTryingDice() {
        return numberOfTryingDice;
    }

    public void setNumberOfTryingDice(int numberOfTryingDice) {
        this.numberOfTryingDice = numberOfTryingDice;
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