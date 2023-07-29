/*Java program to calculate CGPA of a student */
import java.util.Scanner;
public class CGPA {
    public static void main(String[] args)
    {
        double cgpa;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter marks of Subject 1 :");
        double s1 = read.nextDouble();
        System.out.print("Enter marks of Subject 2 :");
        double s2 = read.nextDouble();
        System.out.print("Enter marks of Subject 3 :");
        double s3 = read.nextDouble();
        cgpa = (s1+s2+s3)/30;
        System.out.print("\nCGPA of student :");
        System.out.println(cgpa);
    }
}
