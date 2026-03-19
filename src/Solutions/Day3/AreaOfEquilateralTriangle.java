package Solutions.Day3;

import java.util.Scanner;
public class AreaOfEquilateralTriangle {
    public static void main(String[] ar)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of Equilateral Trianle=");
        double b= sc.nextDouble();
        System.out.printf("Area of Equilatral Triangle= %.2f",(Math.sqrt(3)/4*b*b));
        sc.close();
    }
}
