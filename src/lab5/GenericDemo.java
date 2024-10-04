package lab5;


public class GenericDemo {
    public static void main(String[] args) {
        Generic<Integer> generic1 = new Generic<>(25);
        Generic<String> generic2 = new Generic<>("Hello");
        Generic<Student> generic3 = new Generic<>(new Student("Alice"));

        System.out.println(generic2.getValue().getClass()); // print class java.lang.String
        String str = generic2.getValue();

        // It does not compile
        // Integer num = generic2.getValue();

        Generic generic = new Generic<>("Bye"); // Generics without specifying a type of argument
        String str1 = (String) generic.getValue();
        Integer num1 = (Integer) generic.getValue(); // throws java.lang.ClassCastException

    }
}
