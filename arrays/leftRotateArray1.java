import java.util.Arrays;
public class leftRotateArray1 {
    public static void main(String[] args) {
        int[] arr = {4,9,3,7,5};
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,4,3,2,1};


        //traverseArray(arr);

        //System.out.println(largestElement(arr));

        //System.out.println(secondLargest(arr));

        //System.out.println(sortedOrNot(arr1));

        //int[] arr3 = {1, 1, 2, 3, 4, 4, 5};
        //System.out.println(removeDuplicates(arr3));
        //System.out.println(Arrays.toString(arr3));

        leftRotateArray(arr2);
        System.out.println(Arrays.toString(arr2));
}
public static void leftRotateArray(int[] arr) {
    int temp = arr[0];
    for(int i=1;i<arr.length;i++) {
        arr[i-1] = arr[i];
    }
    arr[arr.length-1] = temp;
}
}
