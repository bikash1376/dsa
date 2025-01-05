public class sortedOrNot {
    public static void main(String[] args) {
        int[] arr = {4, 9, 3, 7, 5};
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};


        //traverseArray(arr);

        //System.out.println(largestElement(arr));

        //System.out.println(secondLargest(arr));

        System.out.println(sortedOrNotArray(arr1));
    }
    public static boolean sortedOrNotArray(int[] arr) {
        for(int i=1; i<arr.length;i++) {
            if(arr[i] < arr[i-1])
                return false;
        }
        return true;
    }
}
