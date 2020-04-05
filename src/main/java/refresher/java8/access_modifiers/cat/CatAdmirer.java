package main.java.refresher.java8.access_modifiers.cat;

// Class from the same package
// Can access all members from BigCat except private one "name"
public class CatAdmirer {

    public static void main(String[] args) {
        BigCat bigCat = new BigCat();

        System.out.println(bigCat.name);
        System.out.println(bigCat.hasFur); // protected members are accessible from within classes in same package
        System.out.println(bigCat.hasPaws);

//        System.out.println(bigCat.id); Won't compile cause it's private
    }
}
