package Solutions.Day3;

import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] ar)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of Circle=");
        double r=sc.nextDouble();
        System.out.printf("Area of Circle= %.2f",(Math.PI*r*r));
        sc.close();
    }
}