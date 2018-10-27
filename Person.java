package com.github.anieweglowska.helloword;

public class Person {
    String nume;
    String surnmae;
    private Gender gender;

    public Person(String nume, String surnmae, Gender gender) {
        this.nume = nume;
        this.surnmae = surnmae;
        this.gender = gender;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getSurnmae() {
        return surnmae;
    }

    public void setSurnmae(String surnmae) {
        this.surnmae = surnmae;
    }


    public void learn(){
        System.out.print("Uczy się.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "nume='" + nume + '\'' +
                ", surnmae='" + surnmae + '\'' +
                ", gender=" + gender +
                '}';
    }
    @Override
    public boolean equals(Object other) {
        Person otherPerson = (Person) other;
        return this.nume.equals(otherPerson.nume) &&
                this.surnmae.equals(otherPerson.surnmae) &&
                this.gender == otherPerson.gender;
    }
}
