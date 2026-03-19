package Solutions.Day3;

import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] ar)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Rectangle=");
        double b= sc.nextDouble();
        System.out.println("Enter breadth of Rectangle=");
        double h= sc.nextDouble();
        System.out.printf("Area of Rectangle= %.2f",(b*h));
        sc.close();
    }

}
