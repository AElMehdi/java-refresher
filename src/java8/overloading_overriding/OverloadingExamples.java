package java8.overloading_overriding;

public class OverloadingExamples {

    public static void main(String[] args) {

        ExactMatch.execute();
        LargerPrimitive.execute();
        Autoboxing.execute();
        Varargs.execute();

        ReferenceType.ExactMatch.execute();
        ReferenceType.SuperType.execute();
        ReferenceType.Varargs.execute();
    }

    // Multiple overloading methods examples:
    // Primitive:
    // 1. Exact match
    // 2. Larger primitive
    // 3. Autoboxing
    // 4. Varargs
    //
    // Reference Type:
    // 1. Exact match
    // 2. Super type
    // 3. Varargs

    private static class ExactMatch {
        private static void process(int number) {
            System.out.println("int");
        }

        private static void process(long number) {
            System.out.println("long");
        }

        private static void execute() {
            process(7);
        }
    }

    private static class LargerPrimitive {
        private static void process(Integer number) {
            System.out.println("Integer");
        }

        private static void process(long number) {
            System.out.println("long");
        }

        private static void execute() {
            process(7);
        }
    }

    private static class Autoboxing {

        private static void process(Integer number) {
            System.out.println("Integer");
        }

        private static void process(Number number) {
            System.out.println("Number");
        }

        private static void execute() {
            process(7);
        }
    }

    private static class Varargs {

        private static void process(int... number) {
            System.out.println("int varargs");
        }

        private static void process(long... number) {
            System.out.println("long varargs");
        }

        private static void execute() {
            process(7);
        }
    }

    private static class ReferenceType {

        private static class ExactMatch {

            private static void process(Integer number) {
                System.out.println("Integer");
            }

            private static void process(Number number) {
                System.out.println("Number");
            }

            private static void execute() {
                process(Integer.valueOf(7));
            }
        }


        private static class SuperType {

            private static void process(Object number) {
                System.out.println("Object");
            }

            private static void process(Number number) {
                System.out.println("Number");
            }

            private static void execute() {
                process(Integer.valueOf(7));
            }

        }

        private static class Varargs {

            private static void process(Object... number) {
                System.out.println("Integer varargs");
            }

            private static void process(Number... number) {
                System.out.println("Number varargs");
            }

            private static void execute() {
                process(Integer.valueOf(7));
            }

        }
    }

}
