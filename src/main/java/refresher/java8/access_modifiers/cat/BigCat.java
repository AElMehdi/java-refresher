package main.java.refresher.java8.access_modifiers.cat;

public class BigCat {

    public String name = "cat";
    protected boolean hasFur = true;
    boolean hasPaws = true;
    private int id;

    public static void main(String[] args) {
        BigCat bigCat = new BigCat();

        System.out.println(bigCat.name);
        System.out.println(bigCat.hasFur);
        System.out.println(bigCat.hasPaws);
        System.out.println(bigCat.id);
    }

    protected void aProtectedMethod() {
        System.out.println("I'm a protected method from the super class");
    }
}
