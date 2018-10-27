package com.github.anieweglowska.helloword;

public class Dog {
    String name;
    private int numberOfLegs;
    // konstruktor domyślny
    public Dog(){
        this.numberOfLegs = 4;
    }

    public Dog(String name) {
        this();
        this.name = name;
    }
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }

    public void bark(){
        System.out.print("hau hau");
    }

    public static void sayhau(){
        System.out.print("hau");
    }
}
