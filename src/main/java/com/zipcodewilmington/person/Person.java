package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String[] likes;
    private int height;
    private int weight;
    private boolean alive;
    private Person parent;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.alive = false;
        this.likes = null;
        this.height = 0;
        this.weight = 0;
        this.parent = null;
    }

    public Person(int age) {
        this.age = age;
        this.name = "";
        this.alive = true;
        this.likes = null;
        this.height = 0;
        this.weight = 0;
        this.parent = null;
    }

    public Person(String name) {
        this.name = name;
        this.age = Integer.MAX_VALUE;
        this.alive = true;
        this.likes = null;
        this.height = 0;
        this.weight = 0;
        this.parent = null;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.alive = true;
        this.likes = null;
        this.height = 0;
        this.weight = 0;
        this.parent = null;
    }

    public Person(String name, int age, String[] likes, int height, int weight, boolean alive, Person parent) {
        this.name = name;
        this.age = age;
        this.alive = true;
        this.likes = likes;
        this.height = height;
        this.weight = weight;
        this.parent = parent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLikes(String[] likes) {
        this.likes = likes;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setParent(Person parent) {
        this.parent = parent;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public String[] getLikes() {
        return likes;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public boolean getAlive() {
        return alive;
    }

    public Person getParent() {
        return parent;
    }
}
