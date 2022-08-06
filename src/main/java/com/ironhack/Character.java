package com.ironhack;

import java.util.Random;

abstract class Character {
    private long id;
    private String name;
    private int hp;
    private boolean isAlive;

    public Character(String name, boolean isAlive) {
        this.name = name;
        this.isAlive = isAlive;
        this.id = new Random().nextLong();
    }

    public Character(long id, String name, int hp, boolean isAlive) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.isAlive = isAlive;
    }

    abstract void setRandomHP();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
