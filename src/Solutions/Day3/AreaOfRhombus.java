package Solutions.Day3;

import java.util.Scanner;
public class AreaOfRhombus {
    public static void main(String[] ar)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first diagonal of Rhombus=");
        double d1= sc.nextDouble();
        System.out.println("Enter the length of second diagonal of Rhombus=");
        double d2= sc.nextDouble();
        System.out.printf("Area of Rhombus= %.2f",(0.5*d1*d2));
        sc.close();
    }
}
