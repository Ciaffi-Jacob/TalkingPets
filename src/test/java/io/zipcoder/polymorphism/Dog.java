package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class Dog {

    @Test
    public void testConstructor(){
        //Given
        String givenName = "Jake";

        //When
        Dog dog = new Dog(givenName);
        String retrievedName = dog.getName();

        //Then
        Assert.assertEquals(givenName, retrievedName);
    }

    @Test
    public void testGetName(){
        //Given
        String givenName = "Bob";
        Dog dog = new Dog(givenName);

        //Then
        Assert.assertEquals(givenName, dog.getName());
    }

    @Test
    public void testSetName(){
        //Given
        String givenName = "Chris";
        Dog dog = new Dog(givenName);

        //When
        this.name = dog.setName("Max");

        //Then
        Assert.assertEquals("Max", dog.getName);
    }

    @Test
    public void testSpeak(){
        Assert.assertEquals("Woof!", dog.speak());
    }
}
