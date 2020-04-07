package refresher.java8.patterns.factory;

public class Pellets extends Food {
   public Pellets(int quantity) {
      super(quantity);
   }

   @Override
   void consumed() {
      System.out.println("Pellets eaten: " + getQuantity());
   }
}
