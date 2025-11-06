import java.util.Arrays;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] prime = { 2, 3, 5, 7, 11, 13, 17, 19 };
        int index = Arrays.binarySearch(prime, 13);
        System.out.println(index);
        index = Arrays.binarySearch(prime, 4);
        System.out.println(index);
    }

}
