package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class Cat {
    @Test
    public void testConstructor(){
        //Given
        String givenName = "Jake";

        //When
        Cat cat = new Cat(givenName);
        String retrievedName = cat.getName();

        //Then
        Assert.assertEquals(givenName, retrievedName);
    }

    @Test
    public void testGetName(){
        //Given
        String givenName = "Bob";
        Cat cat = new Cat(givenName);

        //Then
        Assert.assertEquals(givenName, cat.getName());
    }

    @Test
    public void testSetName(){
        //Given
        String givenName = "Chris";
        Cat cat = new Cat(givenName);

        //When
        this.name = cat.setName("Max");

        //Then
        Assert.assertEquals("Max", cat.getName);
    }

    @Test
    public void testSpeak(){
        Assert.assertEquals("meow.", cat.speak());
    }
}
