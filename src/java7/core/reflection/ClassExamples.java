package java7.core.reflection;

import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;

public class ClassExamples {

    public static void main(String[] args) {
        Person p = new Person();
        Class<? extends Person> aClass = p.getClass();

        out.println("The class is: " + aClass.getName() + ", and its super type is: " + aClass.getSuperclass().getName());

        List<String> methods = Stream.of(aClass.getMethods())
                .map(Method::getName)
                .collect(Collectors.toList());

        out.println("The methods are:" + methods);

    }


    private static class Person {

        private void imPrivate() {

        }

        public void imPublic() {

        }

    }
}
