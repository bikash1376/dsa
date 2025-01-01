import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        //Variable declaration
        byte a; // -128 to 127
        int b;  //-2^31 to 2^31
        long c; //-2^63 to 2^63
        float d;
        double e;
        char ch;
        boolean bool;
        String str;
        //Prompt to ask user to input values
        System.out.println("Enter values in this sequence : byte, int, long, float, double, char, boolean string");
        // Read inputs from the user
        a = in.nextByte();
        b = in.nextInt();
        c = in.nextLong();
        d = in.nextFloat();
        e = in.nextDouble();

        // Read the first character of the next line
        ch = in.next().charAt(0);
       bool = in.nextBoolean();
        // Read the entire remaining line for the string
        str = in.nextLine();
        //Printing tha values
        System.out.println(a+ "," +b+ "," +c+ "," +d+ "," +e+ "," +ch+ "," +bool+ "," +str);

        // Close the scanner to prevent resource leak
        in.close();
    }
}
