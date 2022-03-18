package com.sii.objects;

public class Director {
    private String name;
    private String lastName;

    public Director() {
    }

    public Director(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return name + " " + lastName;
    }
}