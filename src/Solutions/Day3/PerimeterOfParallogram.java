package Solutions.Day3;

import java.util.Scanner;
public class PerimeterOfParallogram {
    public static void main(String[] ar)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base of Parallogram=");
        double b= sc.nextDouble();
        System.out.println("Enter side of Parallogram=");
        double s= sc.nextDouble();
        System.out.printf("Perimeter of Parallogram= %.2f",(2*(b+s)));
        sc.close();
    }
}
