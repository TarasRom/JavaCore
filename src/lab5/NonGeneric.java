package lab5;

public class NonGeneric {
    private Object value;

    public NonGeneric(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public static <T> int method2(T[] array){
        return array.length;
    }
    public static <T extends Number> double method3(T[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue();
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Integer[] array1 = {10, 11, 12, 13, 14};
        Double[] array2 = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] array3 = {"sdf", "sdf"};
        System.out.println(method3(array1));
        System.out.println(method3(array2));
    }

}

