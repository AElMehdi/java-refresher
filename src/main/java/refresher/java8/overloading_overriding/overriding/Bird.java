package main.java.refresher.java8.overloading_overriding.overriding;

public class Bird {

    public void eat() {
        System.out.println("Bird eats!");
    }

    public void enforceFlyingLikeBird() {
        System.out.println("Bird flies!");
    }

    void callFromBird() {
        fly();
    }

    private void fly() {
        System.out.println("Bird can fly: " + canFly());
    }

    protected boolean canFly() {
        return true;
    }

}
