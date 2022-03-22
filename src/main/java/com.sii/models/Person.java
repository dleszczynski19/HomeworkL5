package com.sii.models;

public abstract class Person {
    private String name;
    private String lastName;

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person actor = (Actor) object;
        return name.equals(actor.name) && lastName.equals(actor.lastName);
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}