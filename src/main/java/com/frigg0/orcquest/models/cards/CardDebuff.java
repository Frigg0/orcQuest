package com.frigg0.orcquest.models.cards;

public class CardDebuff {
    // Variables declarations
    private int healthLoss;
    private int cardLoss;
    private int goldLoss;
    private boolean looseAllGold;
    private boolean affectEveryone;

    // Constructors
    public CardDebuff(boolean affectEveryone, int goldLoss, int healthLoss){
        this.affectEveryone = affectEveryone;
        this.goldLoss = goldLoss;
        this.healthLoss = healthLoss;
    }

    public CardDebuff(int healthLoss, int goldLoss) {
        this.healthLoss = healthLoss;
        this.goldLoss = goldLoss;
    }

    public CardDebuff(int healthLoss, int cardLoss, boolean affectEveryone) {
        this.healthLoss = healthLoss;
        this.cardLoss = cardLoss;
        this.affectEveryone = affectEveryone;
    }

    public CardDebuff(boolean looseAllGold, int healthLoss) {
        this.looseAllGold = looseAllGold;
        this.healthLoss = healthLoss;
    }

    public CardDebuff(int healthLoss) {
        this.healthLoss = healthLoss;
    }

    // toString
    @Override
    public String toString() {
        return "CardDebuff{" +
                "healthLoss=" + healthLoss +
                ", cardLoss=" + cardLoss +
                ", goldLoss=" + goldLoss +
                ", looseAllGold=" + looseAllGold +
                ", affectEveryone=" + affectEveryone +
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
    public int getHealthLoss() {
        return healthLoss;
    }

    public void setHealthLoss(int healthLoss) {
        this.healthLoss = healthLoss;
    }

    public int getCardLoss() {
        return cardLoss;
    }

    public void setCardLoss(int cardLoss) {
        this.cardLoss = cardLoss;
    }

    public int getGoldLoss() {
        return goldLoss;
    }

    public void setGoldLoss(int goldLoss) {
        this.goldLoss = goldLoss;
    }

    public boolean isLooseAllGold() {
        return looseAllGold;
    }

    public void setLooseAllGold(boolean looseAllGold) {
        this.looseAllGold = looseAllGold;
    }

    public boolean isAffectEveryone() {
        return affectEveryone;
    }

    public void setAffectEveryone(boolean affectEveryone) {
        this.affectEveryone = affectEveryone;
    }
}
