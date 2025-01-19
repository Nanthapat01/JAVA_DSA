package tester;

import linear.Array;

public class TestArray {
    public static void main(String[] args) {
        linear.Array<Integer> array = new linear.Array<>(5);

        array.append(10);
        array.append(20);
        array.append(30);
        array.print(); // Output: [10, 20, 30]

        array.insert(1, 15);
        array.print(); // Output: [10, 15, 20, 30]

        array.update(2, 25);
        array.print(); // Output: [10, 15, 25, 30]

        array.delete(3);
        array.print(); // Output: [10, 15, 25]

        System.out.println("Index of 15: " + array.search(15)); // Output: Index of 15: 1s
    }
}
