package com.ironhack;

import java.util.ArrayList;

public class Battlefield { //extends CSV
    private ArrayList<Character> army1;
    private ArrayList<Character> army2;

    public Battlefield(int armySize) {
        this.army1 = new ArrayList<>();
        this.army2 = new ArrayList<>();

        for (int i = 0; i <= armySize; i++) {
            army1.add(generateRandomCharacter());
            army2.add(generateRandomCharacter());
        }
    }

    public Battlefield(ArrayList<Character> army1, ArrayList<Character> army2) {
        //generar ejercito random desde la clase de import/export CSV.
        this.setArmy1(army1);
        this.setArmy2(army2);
    }

    public ArrayList<Character> getArmy1() {
        return army1;
    }

    public void setArmy1(ArrayList<Character> army1) {
        this.army1 = army1;
    }

    public ArrayList<Character> getArmy2() {
        return army2;
    }

    public void setArmy2(ArrayList<Character> army2) {
        this.army2 = army2;
    }

    private Character generateRandomCharacter() {
        if ((int) (Math.random() * 10) % 2 == 0)
            return new Warrior();
        return new Wizard();
    }


    public void battle() {
        while (army1.size() != 0 && army2.size() != 0) {
            army1.get(0).attack(army2.get(0));
            army2.get(0).attack(army1.get(0));

            if (!army1.get(0).isAlive()) {
                // graveyard.add(army1.get(0));
                army1.remove(0);
            }

            if (!army2.get(0).isAlive()) {
                // graveyard.add(army2.get(0));
                army2.remove(0);
            }
        }

        if (army1.size() > 0) {
            System.out.println("Army 1 won! Army 2 were a bunch of losers");
        }

        if (army2.size() > 0) {
            System.out.println("Army 2 won! Army 1 were a bunch of babies");
        }
    }
}
