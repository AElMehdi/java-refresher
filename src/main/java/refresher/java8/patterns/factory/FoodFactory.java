package refresher.java8.patterns.factory;

public class FoodFactory {

   static Food getFood(String animalName) {
      switch (animalName) {
         case "zebra":
            return new Hay(100);
         case "rabbit":
            return new Pellets(50);
      }

      throw new UnsupportedOperationException("Unspported animal: " + animalName);
   }

   public static void main(String[] args) {
      final Food food = FoodFactory.getFood("zebra");
      food.consumed();
   }
}
