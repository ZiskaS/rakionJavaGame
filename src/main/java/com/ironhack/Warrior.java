package com.ironhack;

public class Warrior extends Character {
    private int stamina;
    private int strength;

    private static final String[] names = new String[]{"Arne", "Birger", "Bjørn", "Bo", "Erik", "Frode", "Gorm", "Halfdan", "Harald", "Knud", "Kåre", "Leif", "Njal", "Roar", "Rune", "Sten", "Skarde", "Sune", "Svend", "Troels", "Toke", "Torsten", "Trygve", "Ulf", "Ødger", "Åge"};

    public Warrior() {
        super(names[(int) (Math.random() * names.length)], true);
        this.setRandomStamina();
        this.setRandomStrength();
        this.setRandomHP();
    }

    public Warrior(long id, String name, int hp, boolean isAlive, int stamina, int strength) {
        super(id, name, hp, isAlive);
        this.stamina = stamina;
        this.strength = strength;
    }

    public void attack(Character opponent) {
        int staminaCost = 5;
        if (this.stamina >= staminaCost) this.strongAttack(opponent, staminaCost);
        else this.weakAttack(opponent);
    }

    private void strongAttack(Character opponent, int staminaCost) {
        int opponentHealthAfterAttack = opponent.getHp() - this.getStrength();

        if (opponentHealthAfterAttack <= 0) {
            opponent.setAlive(false);
        } else {
            opponent.setHp(opponentHealthAfterAttack);
        }

        this.setStamina(this.stamina - staminaCost);
    }

    private void weakAttack(Character opponent) {
        int opponentHealthAfterAttack = opponent.getHp() - (this.getStrength() / 2);

        if (opponentHealthAfterAttack <= 0) {
            opponent.setAlive(false);
        } else {
            opponent.setHp(opponentHealthAfterAttack);
        }

        this.setStamina(this.stamina + 1);
    }

    public void setRandomHP() {
        this.setHp((int) (Math.random() * 100) + 100);
    }

    public void setRandomStamina() {
        this.stamina = (int) (Math.random() * 40) + 10;
    }

    public void setRandomStrength() {
        this.strength = (int) (Math.random() * 9) + 1;
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
