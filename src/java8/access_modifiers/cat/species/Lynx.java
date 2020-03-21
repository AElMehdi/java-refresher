package java8.access_modifiers.cat.species;

import java8.access_modifiers.cat.BigCat;

// A sub-class in a sub-package
// Can access members with public, default and protected if accessed from an its instance not of the superclass
// Hence hasFur doesn't compile
public class Lynx extends BigCat {

    // Accessing protected fields without reference
    // This will work!
    void useProtectedFieldsWithoutReference() {
        aProtectedMethod();
        System.out.println(hasFur);
    }

    public static void main(String[] args) {
        // A class isn't considered as a a subclass of itself,
        // we won't be able to access protected members from here
        BigCat bigCat = new BigCat();

        // This will allow us to access the protected members
        Lynx lynx = new Lynx();

        System.out.println(bigCat.name);

        System.out.println(lynx.hasFur); // It will compile cause we are ///
//        System.out.println(bigCat.hasFur); Won't compile cause we are using the BigCat variable
//        System.out.println(bigCat.hasPaws);
//        System.out.println(bigCat.id);

        lynx.useProtectedFieldsWithoutReference();
    }
}
