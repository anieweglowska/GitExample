package com.github.anieweglowska.helloword;

public class Main {
    public static void main(String[] args) {
        Person monia = new Person("Monika", "Nowak", Gender.FEMALE);
        Person monia1 = new Person("Monika", "Nowak", Gender.FEMALE);
        System.out.println(monia.equals(monia1));
//
        String a = new String("Java");
        String b = new String("Java");
        String c = "Java";
        String d = "Java";

        System.out.println (a == b);
        System.out.println (c == d);


    }
}
