package com.frigg0.orcquest.models.heroes;

public class Hero {
    // Variables declarations
    private String name;
    private String race;
    private int life;
    private String powerDescription;

    // Constructors
    public Hero(String name, String race, int life, String powerDescription) {
        this.name = name;
        this.race = race;
        this.life = life;
        this.powerDescription = powerDescription;
    }

    public Hero() {
        // empty constructor on purpose
    }

    // toString
    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", life=" + life +
                ", powerDescription='" + powerDescription + '\'' +
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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getPowerDescription() {
        return powerDescription;
    }

    public void setPowerDescription(String powerDescription) {
        this.powerDescription = powerDescription;
    }
}
