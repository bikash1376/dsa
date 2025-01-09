public class SearchInTwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{8, 5, 1}, {3, 4, 2}, {7, 31, 9}};
        int target = 99;
        search(arr, target);
    }

    public static void search(int[][] arr, int target) {
        if (arr.length == 0) {
            System.out.println("No elements in array");
            return;
        }

        boolean found = false;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    System.out.println(target + " found at index at " + row + " row and " + column + " column");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
