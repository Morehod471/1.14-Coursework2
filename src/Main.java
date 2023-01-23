import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[10];
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[arr1.length - 1 - i];

        }
        System.out.println(Arrays.toString(arr2));
    }
}