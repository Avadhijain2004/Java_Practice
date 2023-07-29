import java.util.Scanner;

public class Sum_of_3_numbers 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter three Numbers :");
        Scanner read = new Scanner(System.in);
        int n1 = read.nextInt();
        int n2 = read.nextInt();
        int n3 = read.nextInt();
        System.out.print("Sum of three numbers = ");
        System.out.print(n1+n2+n3);
    }
}
