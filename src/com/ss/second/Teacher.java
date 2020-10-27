package com.ss.second;

public class Teacher extends Staff {
    private final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        this.setName(name);
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void salary() {
        System.out.println("method salary: " +TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON + ", name: " + this.getName());
    }
}
