package com.ironhack;

public class Warrior extends Character {
    private int stamina;
    private int strength;

    public Warrior(String name, boolean isAlive) {
        super(name, isAlive);
        this.setRandomStamina();
        this.setRandomStrength();
        this.setRandomHP();
    }

    public Warrior(long id, String name,  int hp, boolean isAlive, int stamina, int strength) {
        super(id, name, hp, isAlive);
        this.stamina = stamina;
        this.strength = strength;
    }

    public void setRandomHP() {
        this.setHp( (int)(Math.random()*100)+ 100);
    }

    public void setRandomStamina() {
        this.stamina = (int)(Math.random()*40)+ 10;
    }

    public void setRandomStrength() {
        this.strength = (int)(Math.random()*9)+ 1;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
