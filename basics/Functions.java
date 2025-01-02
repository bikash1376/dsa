import java.util.*;
public class Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        //Factorial of number
  /*      System.out.println("Enter a number");
        int num = in.nextInt();
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);*/


        //Check palindrome
 /*       System.out.println("Enter a string");
        in.nextLine();  // Consume the leftover newline character
        String str=in.nextLine();
        palindrome(str);
*/

        //Sum of array elements
/*        System.out.println("Enter size of array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");

        for(int i = 0; i<n;i++) {
            arr[i]=in.nextInt();
        }
        Functions arrSum = new Functions();
        int sum = arrSum.arraySum(arr);
        System.out.println(sum);*/


        //Reverse an array
/*        int[] a = {5,1,6,2,9};
        reverseArray(a);*/


        //Largest and second largest in an array
    /*    int[] b = {5,11,13,2,13};
        largestAndSecondLargest(b);*/

        //Finding largest element
        /*int[] data = {1,2,3,4,5};
        largestWithoutFunctions(data);*/
    }



    public static int factorial(int n) {
        int f=1;
        if(n==0 || n==1)
            return 1;
        for(int i=1;i<=n;i++) {
            f = f*i;
        }
        return f;
    }

    public static void palindrome(String str) {
        String temp = "";
        for(int l = str.length() - 1;l>=0;l--) {
            temp = temp + str.charAt(l);
        }
        if(temp.equals(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }

    public int arraySum(int[] arr) {
        int sum = 0;
        for(int i : arr) {
            sum = sum+i;
        }
        return sum;
    }

    public static void reverseArray(int[] arr) {

        int l = arr.length;
        int[] blankArr = new int[l];

        for (int i = 0; i < l; i++) {
            blankArr[i] = arr[l - 1 - i];
        }
        System.out.println(Arrays.toString(blankArr));  //Array to String functions
        for(int i : blankArr) {  //For each loop
            System.out.println(i);
        }
    }

    public static void largestAndSecondLargest(int[] b) {
        int l = b.length;

        // Ensure that there are at least 2 elements
        if (l < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        // Sort the array
        Arrays.sort(b);

        //Sorted array
        System.out.println("Sorted array: " + Arrays.toString(b));

        // Find largest and second largest
        for (l = l - 1; l > 0; l--) {
            if (b[l] != b[l - 1]) {
                System.out.println("Largest: " + b[l] + ", Second Largest: " + b[l - 1]);
                return;
            }
        }

        // If no distinct second largest is found
        System.out.println("No distinct second largest number found.");
    }

    public static void largestWithoutFunctions(int[] data) {
        int len = data.length;
        for (int i = 0; i < len - 1; i++) {
        for(int j =0; j < len-i-1;j++) {
            if (data[j + 1] > data[j]) {
                int temp = data[j];
                data[j] = data[j + 1];
                data[j + 1] = temp;
            }
        }

        }
        System.out.println("Largest element is: " + data[0]);
        System.out.println("Sorted array: " + Arrays.toString(data));
    }



}
