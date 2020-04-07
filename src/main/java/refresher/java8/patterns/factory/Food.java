package refresher.java8.patterns.factory;

abstract class Food {
   private int quantity;

   Food(int quantity) {
      this.quantity = quantity;
   }

   int getQuantity() {
      return quantity;
   }

   abstract void consumed();
}
