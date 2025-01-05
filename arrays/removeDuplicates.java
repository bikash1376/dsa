import java.util.Arrays;
public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,9,3,7,5};
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,4,3,2,1};


        //traverseArray(arr);

        //System.out.println(largestElement(arr));

        //System.out.println(secondLargest(arr));

        //System.out.println(sortedOrNot(arr1));

        int[] arr3 = {1, 1, 2, 3, 4, 4, 5};
        System.out.println(removeDuplicatesArray(arr3));
        System.out.println(Arrays.toString(arr3));
}
public static int removeDuplicatesArray(int[] arr) {
    int i =0;
    for(int j=1;j< arr.length;j++) {
        if(arr[i]!=arr[j]) {
            i++;
            arr[i]= arr[j];
        }
    }
    return i+1;
}
}
