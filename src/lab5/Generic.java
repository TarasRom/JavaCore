package lab5;

public class Generic<T, V> {
    private T value;
    private V value2;

    public Generic(T value, V value2) {
        this.value = value;
        this.value2 = value2;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public int method1(T[] array){
        return array.length;
    }
}
