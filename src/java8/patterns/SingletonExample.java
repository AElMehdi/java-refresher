package java8.patterns;

public class SingletonExample {

   private static SingletonExample instance;

   private SingletonExample() {

   }

   private static SingletonExample lazyInstantiation() {
      if (instance == null) {
         instance = new SingletonExample();
      }
      return instance;
   }

      if (instance == null) {
         instance = new SingletonExample();
      }
      return instance;
   }

   public static void main(String[] args) {
      SingletonExample instanceOne = lazyInstantiation();
      SingletonExample instanceTwo = lazyInstantiation();

      if (instanceOne.equals(instanceTwo)) {
         System.out.println("It's a singleton.");
      }
   }
}
