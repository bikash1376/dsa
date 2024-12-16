public class FindMissing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int result= findMissingNumberInArray(arr);
        System.out.println("Missing number is: "+result);
    }
    public static int findMissingNumberInArray(int[] array) {
        int n = array.length + 1;
        int expecetedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for(int number : array) {
          actualSum += number;

        }
        return expecetedSum - actualSum;
    }

    
}
