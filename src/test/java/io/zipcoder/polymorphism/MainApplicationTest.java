package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class MainApplicationTest {


@Test
    public void testInheritance(){
        Pet pet = new Dog();
    Assert.assertTrue(pet instanceof Dog);

}

@Test
    public void speakTest(){
    Dog dog = new Dog();
    String expected = "bork, bork!";

    String actual = dog.speak();

    Assert.assertEquals(expected, actual);
}

@Test
    public void speakTest1(){
    Cat cat = new Cat();
    String expected = "meow meow!";

    String actual = cat.speak();

    Assert.assertEquals(expected, actual);
}

@Test
    public void speakTest2(){
    Bird bird = new Bird();
    String expected = "bok bok SQUAWK!";

    String actual = bird.speak();

    Assert.assertEquals(expected, actual);
}

@Test
    public void speakTest3(){
    Pet pet = new Pet();
    String expected = "gobble gobble";

    String actual = pet.speak();

    Assert.assertEquals(expected, actual);
}

}
