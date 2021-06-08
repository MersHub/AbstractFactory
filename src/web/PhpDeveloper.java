package web;

import factory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writes() {
        System.out.println("Php developer writes code...");
    }
}
