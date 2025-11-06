import java.util.Arrays;
public class exemplu1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5};
        System.out.println(Arrays.toString(numbers));
        int[] copy = Arrays.copyOf(numbers, 6);
        System.out.println("dupa copyOf(..., 6): " + Arrays.toString(copy));
        int iGasit = Arrays.binarySearch(copy, 3);
        System.out.println("binarySearch(copy, 3) -> " + iGasit);
    }
}
