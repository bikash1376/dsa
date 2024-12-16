public class BestScores {
    public static void main(String[] args) {
        int[] array = { 90, 85, 95, 80, 92, 88, 76, 67, 89, 91};
            int[] bestScores = findTopTwoScores(array);
            
          for(int result : bestScores) {
            System.out.println(result);
          }
            
    }
    public static int[] findTopTwoScores(int[] array) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        
        for(int score: array) {
            if(score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
        }
        else if(score > secondHighest && score != firstHighest) {
            secondHighest = score;
    }
}
return new int[] {
    firstHighest, secondHighest
};
    }
}
