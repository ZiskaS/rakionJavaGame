package com.ironhack;

public class Wizard extends Character {
    int mana;
    int intelligence;

    public Wizard(String name, boolean isAlive, int mana, int intelligence) {
        super(name, isAlive);
        this.setRandomIntelligence();
        this.setRandomMana();
        this.setRandomHP();
    }

    public Wizard(long id, String name, int hp, boolean isAlive, int mana, int intelligence) {
        super(id, name, hp, isAlive);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public void setRandomHP() {
        this.setHp( (int)(Math.random()*50)+ 50);
    }

    public void setRandomMana() {
        this.mana = (int)(Math.random()*40)+ 10;
    }

    public void setRandomIntelligence() {
        this.mana = (int)(Math.random()*49)+ 1;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
