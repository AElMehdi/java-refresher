package refresher.java8.hashcode_equals;

public class HashcodeEqualsExample {
   private String name;
   private int age;

   private HashcodeEqualsExample(String name, int age) {
      this.name = name;
      this.age = age;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      HashcodeEqualsExample that = (HashcodeEqualsExample) o;

      if (age != that.age) return false;
      return name.equals(that.name);
   }

   // Used by collections with a hashing algorithm
   // to separate instances into buckets.
   // The rules are:
   // 1. If two instances are equal, they should return the same hash
   // 2. If two instances aren't equal, it doesn't mean that they will have the different hash
   // 3. Calling hashcode on an object must always return the same value
   @Override
   public int hashCode() {
      int result = name.hashCode();
      result = 31 * result + age;
      return result;
   }

   public static void main(String[] args) {
      HashcodeEqualsExample yassine = new HashcodeEqualsExample("Yassine", 28);
      HashcodeEqualsExample yassine1 = new HashcodeEqualsExample("Yassine", 28);

      if (yassine.equals(yassine1)) {
         System.out.println("Equals correctly implemented");
      }
   }
}
