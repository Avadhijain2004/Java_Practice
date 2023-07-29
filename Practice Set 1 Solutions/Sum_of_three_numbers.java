/*Java program to find the sum of 3 Numbers */
import java.util.Scanner;
class Sum_of_three_numbers45
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