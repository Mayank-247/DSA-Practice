package Solutions.Day3;

import java.util.Scanner;
public class PerimeterOfEquilateralTriangle {
    public static void main(String[] ar)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of Equilateral Triangle=");
        double s= sc.nextDouble();
        System.out.printf("Perimeter of Equilateral Triangle= %.2f",(3*s));
        sc.close();
    }
}
