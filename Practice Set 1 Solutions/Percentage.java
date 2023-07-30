import java.util.Scanner;
public class Percentage 
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter total marks of all subjects : ");
        double total = read.nextDouble();
        System.out.print("Enter marks of subject 1 : ");
        double s1 = read.nextDouble();
        System.out.print("Enter marks of subject 2 : ");
        double s2 = read.nextDouble();
        System.out.print("Enter marks of subject 3 : ");
        double s3 = read.nextDouble();
        System.out.print("Enter marks of subject 4 : ");
        double s4 = read.nextDouble();
        System.out.print("Enter marks of subject 5 : ");
        double s5 = read.nextDouble();
        double sum = s1+s2+s3+s4+s5;
        double percentage = (sum/total)*100;
        System.out.println("The percentage of a student is :"+ percentage + "%");
    }

}
