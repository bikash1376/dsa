import java.util.Arrays;
public class array {
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

        //leftRotateArray1(arr2);
        //System.out.println(Arrays.toString(arr2));

        int d=2;
        leftRotateArray2(arr1,d);
        System.out.println(Arrays.toString(arr1));
    }
    public static void traverseArray(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }


    public static int largestElement(int[] arr) {
        int largest = arr[0];
        for(int i=1;i<=arr.length-1;i++) {
            if(arr[i]>largest)
                largest = arr[i];
        }
        return largest;
    }

    public static int secondLargest(int[] arr) {
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

    public static boolean sortedOrNot(int[] arr) {
        for(int i=1; i<arr.length;i++) {
            if(arr[i] < arr[i-1])
                return false;
        }
        return true;
    }

    public static int removeDuplicates(int[] arr) {
        int i =0;
        for(int j=1;j< arr.length;j++) {
            if(arr[i]!=arr[j]) {
                i++;
                arr[i]= arr[j];
            }
        }
        return i+1;
    }

    public static void leftRotateArray1(int[] arr) {
        int temp = arr[0];
        for(int i=1;i<arr.length;i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }

    public static void leftRotateArray2(int[] arr, int d) {
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
