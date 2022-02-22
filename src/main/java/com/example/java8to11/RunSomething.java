package com.example.java8to11;

public interface RunSomething {
    void doIt();
    static void printName() {

    }
    default void printAge() {

    }
}
