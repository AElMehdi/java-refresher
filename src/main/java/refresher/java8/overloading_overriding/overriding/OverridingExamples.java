package main.java.refresher.java8.overloading_overriding.overriding;

import main.java.refresher.java8.overloading_overriding.overriding.hiding.HiddenGoose;

public class OverridingExamples {

    public static void main(String[] args) {
        overriding();
        hiding();
    }

    private static void overriding() {
        Goose goose = new Goose();

        System.out.println("*** Overriding Examples ***");
        // Overrides parent method
        goose.eat();

        // Explicitly calling the parent method
        goose.enforceFlyingLikeBird();

        // It will call the child class method in both cases
        goose.callFromBird();
        goose.callFromGoose();
    }

    private static void hiding() {
        HiddenGoose goose = new HiddenGoose();

        System.out.println("*** Hiding Examples ***");
        goose.callFromGoose();
        goose.callFromBird();
    }
}
