package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class Bird{

    @Test
    public void testConstructor(){
        //Given
        String givenName = "Jake";

        //When
        Bird bird = new Bird(givenName);
        String retrievedName = bird.getName();

        //Then
        Assert.assertEquals(givenName, retrievedName);
    }

    @Test
    public void testGetName(){
        //Given
        String givenName = "Bob";
        Bird bird = new Bird(givenName);

        //Then
        Assert.assertEquals(givenName, bird.getName());
    }

    @Test
    public void testSetName(){
        //Given
        String givenName = "Chris";
        Bird bird = new bird(givenName);

        //When
        this.name = bird.setName("Max");

        //Then
        Assert.assertEquals("Max", bird.getName);
    }

    @Test
    public void testSpeak(){
        Assert.assertEquals("Chirp!", bird.speak());
    }

}
