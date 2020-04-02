package java8.patterns;

public class SingletonExample {

   private static SingletonExample instance;

   private SingletonExample() {

   }

   public static SingletonExample getInstance() {
      if (instance == null) {
         instance = new SingletonExample();
      }
      return instance;
   }

   public static void main(String[] args) {
      SingletonExample instanceOne = getInstance();
      SingletonExample instanceTwo = getInstance();

      if (instanceOne.equals(instanceTwo)) {
         System.out.println("It's a singleton.");
      }
   }
}
