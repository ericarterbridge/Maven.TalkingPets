package io.zipcoder.polymorphism;

public class Cat extends Pet {
    Cat(String name) {
        super(name);
    }

    @Override
    public String speak(){
        return "meow meow!";
    }

    public Cat(){};
}
