import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            float radius = scan.nextFloat();
            double areaofcircle = 3.14 * radius * radius;
            System.out.println(areaofcircle);
        }
        

    }
    
}
