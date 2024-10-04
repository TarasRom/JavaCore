package lab5;

public class Generic<T> {
    private T value;

    public Generic(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public int length(T[] array) {
        return array.length;
    }

}
