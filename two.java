import java.util.*;
public class two {
    public static void main(String args[])
    {
        try (// FOR WORD
        Scanner scan = new Scanner(System.in)) {
            String input = scan.next();
            System.out.println(input);
        }
        try (// FOR WORD WITH SPACE
        Scanner scan1 = new Scanner(System.in)) {
            String scentence = scan1.nextLine();
            System.out.println(scentence);
        }
        try (// FOR INTEGER
        Scanner scan2 = new Scanner(System.in)) {
            int number = scan2.nextInt();
            System.out.println(number);
        } 
        try (// FOR NUMBER WITH .
        Scanner scan3 = new Scanner(System.in)) {
            float digit = scan3.nextFloat();
            System.out.println(digit);
        }



    }
}