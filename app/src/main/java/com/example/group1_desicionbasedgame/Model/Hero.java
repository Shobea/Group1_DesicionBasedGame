package com.example.group1_desicionbasedgame.Model;

public class Hero {

    private String name;
    private int maxHealth,health, minAtk, maxAtk;

    //setters
    public void setName(String name) {this.name=name;}
    public void setMaxHealth(int maxHealth){this.maxHealth=maxHealth;}
    public void setHealth(int health) {this.health=health;}
    public void setMinAtk(int minAtk) {this.minAtk = minAtk;}
    public void setMaxAtk(int maxAtk){this.maxAtk=maxAtk; }

    //getters
    public String getName() {return name;}
    public int getMaxHealth() {return maxHealth;}
    public int getHealth() {return health;}
    public int getMinAtk() {return minAtk;}
    public int getMaxAtk() {return maxAtk;}

    public Hero(String name, int maxHealth, int health, int minAtk, int maxAtk) {
        this.name = name;
        this.maxHealth=maxHealth;
        this.health = health;
        this.minAtk=minAtk;
        this.maxAtk=maxAtk;
    }
}