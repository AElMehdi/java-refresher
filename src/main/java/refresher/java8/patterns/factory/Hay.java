package refresher.java8.patterns.factory;

public class Hay extends Food {

   public Hay(int quantity) {
      super(quantity);
   }

   @Override
   void consumed() {
      System.out.println("Hay eaten: " + getQuantity());
   }
}
