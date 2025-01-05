public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {4, 9, 3, 7, 5};
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};


        //traverseArray(arr);

        //System.out.println(largestElement(arr));

        System.out.println(secondLargestArray(arr));
    }
    public static int secondLargestArray(int[] arr) {
        int sl = Integer.MIN_VALUE;
        int l = arr[0];
        for(int i =0;i<arr.length;i++) {
            if(arr[i]>l) {
                sl = l;
                l = arr[i];
            }
            if(arr[i]>sl && arr[i]!=l) {
                sl = arr[i];
            }
        }
        return sl;
    }
}
