package lab5;

public class NonGeneric {
    public static <T> int length(T[] array) {
        return array.length;
    }

    public static <T extends Number> double average(T[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue();
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Double[] array2 = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] array3 = {"abc", "cnf"};

        System.out.println(length(array1));
        System.out.println(length(array2));
        System.out.println(length(array3));

        System.out.println(average(array1));
        System.out.println(average(array2));

        // The next line will not compile
        // System.out.println(average(array3));


    }

}
