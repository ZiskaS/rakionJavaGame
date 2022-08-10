package com.ironhack;

public class Wizard extends Character {
    int mana;
    int intelligence;

    private static final String[] names = new String[]{"Abbad", "Abbas", "al-Uzza", "Salam", "Manaf", "Rabbo", "Fattah", "Nour", "Abdi", "Abdolreza", "Abdu", "Abdul", "Ahad", "Ali", "Alim", "Azim", "al-Aziz", "Baqi", "Bari", "Basir", "Basit", "Ghaffar", "Ghani", "Hadi", "Hafiz", "Hai", "Hakim", "Halim", "Hamid", "Haq", "Hussein", "Jabbar", "Jalil", "Jamil", "Karim", "Khaliq", "Latif", "Majid", "Malik", "Mannan", "Monem"};

    public Wizard() {
        super(names[(int) (Math.random() * names.length)], true);
        this.setRandomIntelligence();
        this.setRandomMana();
        this.setRandomHP();
    }

    public Wizard(long id, String name, int hp, boolean isAlive, int mana, int intelligence) {
        super(id, name, hp, isAlive);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public void attack(Character opponent) {
        int manaCost = 5;
        if (this.mana >= manaCost) this.castFireball(opponent, manaCost);
        else this.staffHit(opponent);
    }

    private void castFireball(Character opponent, int manaCost) {
        int opponentHealthAfterAttack = opponent.getHp() - this.getIntelligence();

        if (opponentHealthAfterAttack <= 0) {
            opponent.setAlive(false);
        } else {
            opponent.setHp(opponentHealthAfterAttack);
        }

        this.setMana(this.mana - manaCost);
    }

    private void staffHit(Character opponent) {
        int opponentHealthAfterAttack = opponent.getHp() - 2;

        if (opponentHealthAfterAttack <= 0) {
            opponent.setAlive(false);
        } else {
            opponent.setHp(opponentHealthAfterAttack);
        }

        this.setMana(this.mana + 1);
    }

    public void setRandomHP() {
        this.setHp((int) (Math.random() * 50) + 50);
    }

    public void setRandomMana() {
        this.mana = (int) (Math.random() * 40) + 10;
    }

    public void setRandomIntelligence() {
        this.mana = (int) (Math.random() * 49) + 1;
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
