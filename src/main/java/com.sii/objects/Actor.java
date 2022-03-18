package com.sii.objects;

public class Actor {
    private String name;
    private String lastName;

    public Actor() {
    }

    public Actor(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return name + "_" + lastName;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Actor actor = (Actor) object;
        return name.equals(actor.name) && lastName.equals(actor.lastName);
    }
}