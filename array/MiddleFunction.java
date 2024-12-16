public class MiddleFunction {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = middle(arr);

        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }

    public static int[] middle(int[] array) {
        if(array.length <= 2)
            return new int[0];

        int[] middleArray = new int[array.length - 2];
        int index = 1;

        while(index < array.length - 1) {
            middleArray[index - 1] = array[index];
            index++;
        }

        return middleArray;
    }
}
