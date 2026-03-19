package Solutions.Day3;

import java.util.Scanner;
public class AreaOfParallogram {
    public static void main(String[] ar)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base of Parallogram=");
        double b= sc.nextDouble();
        System.out.println("Enter height of Parallogram=");
        double h= sc.nextDouble();
        System.out.printf("Area of Parallogram= %.2f",(b*h));
        sc.close();
    }
}
