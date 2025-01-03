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

        //ASCII to char and vice versa
     /*   char ch = 'a';
        int z = 67;
        charToAscii(ch,z);*/

        //Swap function
   /*     int m = 29;
        int n = 13;
        swapFunc(m,n);*/


        //Count digits function
    /*    long number = 999999999;
        int count = countFunc(number);
        System.out.println(count);*/


        //Fibonacci series upto n
   /*     int x = 0, y = 1;
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        fibonacciSeries(x,y,n);*/

        //GCD of two numbers
     /*   int num1 = 20, num2 = 16;
        int gcd = gcdOfTwoNumbers(num1, num2);
        System.out.println(gcd);*/

        //Reverse number/Check palindrome
        /*int val = 123212;

        int rev = reverseNum(val);
        System.out.println("Original Number = " +val);
        System.out.println("Reverse Number = " +rev);*/


        //Exponent
 /*       int base = 3;
        int index = 4;
        int result = exponent(base, index);
        System.out.println(result);*/


        //Function to check Prime number
  /*      int numToCheck = 712;
        boolean primeOrNot = checkPrime(numToCheck);
        System.out.println(primeOrNot);*/

        //String Palindrome Check
   /*     String st = "bob";
        //boolean stringCheck = stringPalindromeCheck(st);
        //System.out.println(stringCheck);
        System.out.println(stringPalindromeCheck(st));*/
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

public static void charToAscii(char chr, int z) {
        int ascii = chr;
        int castAscii = (int)chr;  //Alternative method
    char ch = (char)z;
    System.out.println(ascii);
    System.out.println(castAscii);
    System.out.println(ch);
}

public static void swapFunc(int m, int n) {
        int temp = m;
        m =n;
        n = temp;
    System.out.println("m:"+m+" n:"+n);
}

public static int countFunc(long number) {
        int count =0;
        while(number!=0) {
            number=number/10;
            ++count;
        }
        return count;
}

public static void fibonacciSeries(int x, int y, int n) {
    System.out.print(x+ " " +y);
    for(int i=2;i<n;i++) {
        int z = x+y;
        System.out.print(" "+z+" ");
        x = y;
        y = z;
    }
}

public static int gcdOfTwoNumbers(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

public static int reverseNum(int val) {
        int rev = 0;
        int temp = val;
        while(val!=0) {
            int r = val%10;
            rev = rev*10+r;
            val = val/10;
        }
        if(temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        return rev;
}

public static int exponent(int base, int index) {
        int result=1;
        for(int i = 0; i<index;i++) {
            result*= base;
        }
        return result;
}

public static boolean checkPrime(int numToCheck) {
    if (numToCheck <= 1) {
        return false;
    }
        for(int i= 2;i<=Math.sqrt(numToCheck);i++) {
            if(numToCheck%i==0)
                return false;
        }
    return true;
}

public static boolean stringPalindromeCheck(String str) {
        String revStr="";
        for(int i=str.length()-1;i>=0;i--) {
            revStr = revStr + str.charAt(i);
        }
         if(str.toLowerCase().equals(revStr.toLowerCase()))
             return true;
         else
             return false;
}

}
