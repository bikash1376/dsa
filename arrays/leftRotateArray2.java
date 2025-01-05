import java.util.Arrays;

public class leftRotateArray2 {
    public static void main(String[] args) {
        int[] arr = {4, 9, 3, 7, 5};
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};


        //traverseArray(arr);

        //System.out.println(largestElement(arr));

        //System.out.println(secondLargest(arr));

        //System.out.println(sortedOrNot(arr1));

        //int[] arr3 = {1, 1, 2, 3, 4, 4, 5};
        //System.out.println(removeDuplicates(arr3));
        //System.out.println(Arrays.toString(arr3));

        //leftRotateArray1(arr2);
        //System.out.println(Arrays.toString(arr2));

        int d = 2;
        leftRotateArray2Problem(arr1, d);
        System.out.println(Arrays.toString(arr1));
    }
    public static void leftRotateArray2Problem(int[] arr, int d) {
        if (d == 0 || d == arr.length) {
            return;
        }

        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[arr.length - d + i] = temp[i];
        }
    }
}
