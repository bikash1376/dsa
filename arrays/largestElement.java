public class largestElement {
    public static void main(String[] args) {
        int[] arr = {4, 9, 3, 7, 5};
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};


        //traverseArray(arr);

        System.out.println(largestElementArray(arr));
    }
    public static int largestElementArray(int[] arr) {
        int largest = arr[0];
        for(int i=1;i<=arr.length-1;i++) {
            if(arr[i]>largest)
                largest = arr[i];
        }
        return largest;
    }
}
