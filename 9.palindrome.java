import java.util.*;

 // Compiler version JDK 11.0.2

 public class Palindrome {

    public static void main(String[] args) {

        int num , rev = 0, remainder, original;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the number");
           num= sc.nextInt();

        original = num;

         
        while( num != 0 )
        {
            remainder = num % 10;
            rev = rev * 10 + remainder;
            num  /= 10;
        }

        
        if (original == rev)
            System.out.println(original + " is a palindrome.");
        else
            System.out.println(original + " is not a palindrome.");
    }
}