import java.util.Scanner;

public class sum {
    public static void main(String args[])
    {
        try (Scanner scan = new Scanner(System.in)) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int sum = a+b;
            System.out.println(sum);
        }
    }
}
