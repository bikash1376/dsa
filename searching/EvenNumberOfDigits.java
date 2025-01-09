public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {2,521,5125,75,24,131};
        int count = findNumber(arr);
        System.out.println(count);
    }
    public static int findNumber(int[] nums) {
        int count =0;
        for(int num : nums) {
            if(even(num)) {
                count++;
            }

        }
        return count;
    }
    public static boolean even(int num) {
        int numOfDigits = digits(num);
        return numOfDigits % 2 ==0;

    }
    public static int digits(int num) {
        return (int)(Math.log10(num)) +1;
    }

    public static int digits1(int num) {
        if(num<0)
            num = num*-1;
        if(num == 0)
            return 1;
        int count = 0;
        while(num>0) {
            count++;
            num= num/10;
        }
        return count;
    }
}
