package com.sii;

public class Actor {
    private String name;
    private String lastName;

    public Actor(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return name + " " + lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
