package banking;

import factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writes() {
        System.out.println("Java developer writes java code ....");
    }
}
