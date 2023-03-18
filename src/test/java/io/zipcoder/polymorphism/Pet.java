package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Pet {

    @Test
    public void testConstructor(){
        //Given
        String givenName = "Jake";

        //When
        Pet pet = new Pet(givenName);
        String retrievedName = pet.getName();

        //Then
        Assert.assertEquals(givenName, retrievedName);
    }

    @Test
    public void testGetName(){
        //Given
        String givenName = "Bob";
        Pet pet = new Pet(givenName);

        //Then
        Assert.assertEquals(givenName, pet.getName());
    }

    @Test
    public void testSetName(){
        //Given
        String givenName = "Chris";
        Pet pet = new Pet(givenName);

        //When
        this.name = pet.setName("Max");

        //Then
        Assert.assertEquals("Max", pet.getName);
    }

    @Test
    public void testSpeak(){
        Assert.assertEquals("Woof!", pet.speak());
    }
}
