package Solutions.Day3;

import  java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] ar)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base of Trianle=");
        double b= sc.nextDouble();
        System.out.println("Enter height of Trianle=");
        double h= sc.nextDouble();
        System.out.printf("Area of Triangle= %.2f",(0.5*b*h));
        sc.close();
    }
}
