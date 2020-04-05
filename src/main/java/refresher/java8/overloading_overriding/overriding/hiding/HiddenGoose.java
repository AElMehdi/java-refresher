package main.java.refresher.java8.overloading_overriding.overriding.hiding;

public class HiddenGoose extends HiddenBird {

    private static boolean isFed() {
        return false;
    }

    // In hidden method (static), the invoked method is the one in the class from where the call is made
    // That not the case for the overridden methods where the call will depend only on the reference type (instance) used.
    public void callFromGoose() {
        System.out.println("Goose is fed: " + isFed());
    }
}
