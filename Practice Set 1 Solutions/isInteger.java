/*Java program to check whether entered number is Integer or not */
import java.util.Scanner;
public class isInteger 
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number :");
        System.out.println(read.hasNextInt());
    }
}
