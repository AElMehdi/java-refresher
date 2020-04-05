package main.java.refresher.java8.access_modifiers.mouse;

import main.java.refresher.java8.access_modifiers.cat.BigCat;

// A class in a different package
// Can only access public members
public class Mouse {

    public static void main(String[] args) {
        BigCat bigCat = new BigCat();

        // Won't be able to access a protected member from a superclass in another class in a different package
        // Except if it inherits from it (subclass of a superclass in this case Lynx)
//        lynx.hasFur
        System.out.println(bigCat.name);

        // Won't compile
//        System.out.println(bigCat.hasFur); protected
//        System.out.println(bigCat.hasPaws); default
//        System.out.println(bigCat.id); private
    }
}
