package Solutions.Day3;

import java.util.Scanner;
public class PerimeterOfCircle {
    public static void main(String[] ar)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of Circle=");
        double r= sc.nextDouble();
        System.out.printf("Perimeter of Circle= %.2f",(2*Math.PI*r));
        sc.close();
    }
}
