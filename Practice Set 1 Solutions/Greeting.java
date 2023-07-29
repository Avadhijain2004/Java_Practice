import java.util.Scanner;
public class Greeting 
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = read.nextLine();
        System.out.println("Hello " + name + ", Have a nice day !!");
    }   
}
