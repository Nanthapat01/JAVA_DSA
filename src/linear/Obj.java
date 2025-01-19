package linear;

public class Obj<T> {
    protected T[] data;
    protected int element;
    protected int size;

    public Obj(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Error: Size must be greater than 0!");
        }
        this.size = size;
        this.data = (T[]) new Object[size];
        this.element = -1;
    }

    public int getElementCount() {
        return this.element;
    }

    protected void incrementElementCount() {
        this.element++;
    }

    protected void decrementElementCount() {
        this.element--;
    }

    public boolean isFull() {
        return this.element == this.size - 1;
    }

    public boolean isEmpty() {
        return this.element == -1;
    }
}
