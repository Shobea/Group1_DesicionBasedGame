package com.example.group1_desicionbasedgame.Model;

public class Hero {

    private String name;
    private int health, mana, attack;

    public void setName(String name) {this.name=name;}
    public void setHealth(int health) {this.health=health;}
    public void setMana(int mana){this.mana=mana;}
    public void setAttack(int attack){this.attack=attack;}

    public String getName() {return name;}
    public int getHealth() {return health;}
    public int getMana() {return mana;}
    public int getAttack(){return attack;}

    public Hero(String name, int health, int mana, int attack) {
    }
}