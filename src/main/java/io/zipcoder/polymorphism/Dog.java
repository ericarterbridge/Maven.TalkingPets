package io.zipcoder.polymorphism;

public class Dog extends Pet {
    Dog(String name){
        super(name);
    }

    @Override
    public String speak(){
        return "bork, bork!";
    }

    public Dog(){};

}
