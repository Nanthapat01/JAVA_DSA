package array;

import array.Array;

public class Main {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<Integer>(10);

        arr.append(10);
        arr.append(20);
        arr.append(30);

        arr.print();
        arr.insert(2, 100);

        arr.print();

        arr.delete(1);
        arr.print();
    }
}
