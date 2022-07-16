package io.zipcoder.polymorphism;

public class Pet {
    public String name;
    //public String speak;
    Pet (String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String speak(){
        return "gobble gobble";
    }

    public Pet(){};
}
