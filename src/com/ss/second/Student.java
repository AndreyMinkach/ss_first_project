package com.ss.second;

public class Student extends Person {
    public Student(String name) {
        this.setName(name);
    }

    @Override
    public void print() {
        System.out.println("I am a student" + " " + this.getName());
    }
}
