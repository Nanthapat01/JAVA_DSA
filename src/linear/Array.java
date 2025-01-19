package linear;

public class Array<T> extends Obj<T> {

    public Array(int size) {
        super(size); // Call the constructor of Obj
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i <= this.element; i++) {
            if (i == this.element) {
                System.out.print(this.data[i]);
            } else {
                System.out.print(this.data[i] + ", ");
            }
        }
        System.out.println("]");
    }

    public void append(T data) {
        if (isFull()) {
            System.out.println("Error: Array is full!");
            return;
        }
        this.data[++this.element] = data;
    }

    public void insert(int pos, T data) {
        if (isFull()) {
            System.out.println("Error: Array is full!");
            return;
        }
        if (pos < 0 || pos > this.element + 1) {
            System.out.println("Error: Invalid position!");
            return;
        }
        for (int i = this.element; i >= pos; i--) {
            this.data[i + 1] = this.data[i];
        }
        this.data[pos] = data;
        this.incrementElementCount();
    }

    public void delete(int pos) {
        if (isEmpty()) {
            System.out.println("Error: Array is empty!");
            return;
        }
        if (pos < 0 || pos > this.element) {
            System.out.println("Error: Invalid position!");
            return;
        }
        for (int i = pos; i < this.element; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.decrementElementCount();
    }

    public void update(int pos, T data) {
        if (isEmpty()) {
            System.out.println("Error: Array is empty!");
            return;
        }
        if (pos < 0 || pos > this.element) {
            System.out.println("Error: Invalid position!");
            return;
        }
        this.data[pos] = data;
    }

    public int search(T key) {
        if (isEmpty()) {
            System.out.println("Error: Array is empty!");
            return -1;
        }
        for (int i = 0; i <= this.element; i++) {
            if (this.data[i].equals(key)) {
                return i;
            }
        }
        System.out.println("Error: Data not found!");
        return -1;
    }
}
