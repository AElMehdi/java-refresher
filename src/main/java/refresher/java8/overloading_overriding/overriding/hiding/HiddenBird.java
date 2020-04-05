package main.java.refresher.java8.overloading_overriding.overriding.hiding;

public class HiddenBird {

    private static boolean isFed() {
        return true;
    }

    public void callFromBird() {
        System.out.println("Bird is fed: " + isFed());
    }

}
