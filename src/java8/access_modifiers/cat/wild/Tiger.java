package java8.access_modifiers.cat.wild;

import java8.access_modifiers.cat.BigCat;
import java8.access_modifiers.cat.species.Lynx;

public class Tiger extends BigCat {

    public void useProtectedMethodFromBigCat() {
        aProtectedMethod();
    }

    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        tiger.aProtectedMethod();

        Lynx lynx = new Lynx();
//        lynx.aProtectedMethod(); Won't compile: protected members are only accessed via reference type of the subclass we are in.

    }
}
