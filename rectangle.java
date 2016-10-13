/**
*This Program is designed to calculate the area of a rectangle using its width and height.
*Author:Hamza Wasim
*10/10/13
*/
import java.util.Scanner;
class rectangle {
public static void main (String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the length of Rectangle:");
double length = scanner.nextDouble();
System.out.println("Enter the width of Rectangle:");
double width = scanner.nextDouble();
//Area = length*width;
double area = length*width;
System.out.println("Area of Rectangle is:" +area+ " units");
scanner.close();
}
}
