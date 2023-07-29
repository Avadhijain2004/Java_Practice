/*Java program to convert Kilometers into miles */
import java.util.Scanner;
public class km_to_miles 
{
    public static void main(String[] args)
    {
        double miles;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter kilometers :");
        double km = read.nextDouble();
        miles = km*0.621371; 
        System.out.print("Miles = ");
        System.out.println(miles +" miles");
    }  
}
