/*Java program to encrypt a grade by adding 8 to it and then decrypt it to show the correct grade */
import java.util.Scanner;
public class Enc_Dec 
{
    public static void main(String[] args) 
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char grade = read.next().charAt(0);
        //Encrypting the grade
        grade = (char)(grade + 8);
        System.out.println("Encrypted grade: "+ grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println("Decrypted grade: "+grade);
    } 
}
