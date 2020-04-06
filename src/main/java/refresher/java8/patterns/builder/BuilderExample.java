package refresher.java8.patterns.builder;

import static java.lang.System.*;

class BuilderExample {
   private String name;
   private int age;

   private BuilderExample(Builder builder) {
      this.name = builder.name;
      this.age = builder.age;
   }

   public String name() {
      return name;
   }

   public int age() {
      return age;
   }

   @Override
   public String toString() {
      return "BuilderExample{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
   }

   static class Builder {
      private String name;
      private int age;

      Builder name(String name) {
         this.name = name;
         return this;
      }

      Builder age(int age) {
         this.age = age;
         return this;
      }

      BuilderExample build() {
         return new BuilderExample(this);
      }
   }

   public static void main(String[] args) {
      BuilderExample youssef = new Builder()
            .name("Yassine")
            .age(25).build();

      out.println(youssef);
   }
}
