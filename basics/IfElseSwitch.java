import java.util.Scanner;

public class IfElseSwitch {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1, 2 or 3");
        n=in.nextInt();

        //switch case/menu driven
        switch(n) {
            case 1:
                System.out.println("Enter two numbers");
                int a = in.nextInt();
                int b = in.nextInt();
                //if else-if else conditions
                if(a>b) {
                    System.out.println(a+" is greater");
                }
                else if(a<b) {
                    System.out.println(b+" is greater");
                }
                else {
                    System.out.println("Both are equal");
                }
                break;
            case 2:
                System.out.println("Enter two numbers");
                int x = in.nextInt();
                int y = in.nextInt();
                //Ternary operator(?:)
                String result = (x > y) ? "is greater" : "is smaller";
                //if x==y, this logic will give wrong answer
                System.out.println("The first number " + result + " than the second number");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
