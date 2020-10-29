import java.util.*;

 // Compiler version JDK 11.0.2

 
public class Armstrong {

    public static void main(String[] args) {

        int num , originalNumber, rem, result = 0;
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the number");
           num= sc.nextInt();
        originalNumber = num;

        while (originalNumber != 0)
        {
            rem = originalNumber % 10;
            result += Math.pow(rem , 3);
            originalNumber /= 10;
        }

        if(result == num)
            System.out.println(num+ " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
