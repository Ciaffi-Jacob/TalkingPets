package io.zipcoder.polymorphism;

public class Pet {
    String name;
    public Pet(String givenName) {
        this.name = givenName;
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
