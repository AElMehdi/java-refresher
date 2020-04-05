package main.java.refresher.java8.overloading_overriding.overriding;

public class Goose extends Bird {

    @Override
    public void eat() {
        System.out.println("Goose eats!");
    }

    @Override
    public void enforceFlyingLikeBird() {
        super.enforceFlyingLikeBird();
    }

    void callFromGoose() {
        System.out.println("Call from goose: " + canFly());
    }

    @Override
    protected boolean canFly() {
        return false;
    }
}
