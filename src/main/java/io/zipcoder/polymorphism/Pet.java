package io.zipcoder.polymorphism;

public class Pet {
    Pet pet;
    String name;
    public Pet(String givenName) {
        this.name = "Bob";
    }

    public String getName() {
        return  name;
    }

    public String setName(String max) {
        return this.name = max;
    }
    public String speak(){
        return "noise!";
    }
}
