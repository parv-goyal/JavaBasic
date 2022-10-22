import java.util.Scanner;

public class rectangle {
    public static void main(String args[]) {
        try (Scanner scan = new Scanner(System.in)) {
            float length = scan.nextFloat();
            float bredth = scan.nextFloat();
            double areaofrectangle = length * bredth;
            System.out.println("area of rectangle:" +areaofrectangle);
            double perameterofrectangle = 2*(length + bredth);
            System.out.println("perameter of rectangle:"+perameterofrectangle);
        }
        

    }
}
