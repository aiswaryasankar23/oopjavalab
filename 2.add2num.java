import java.util.*;

 // Compiler version JDK 11.0.2

 class addition
 {
   public static void main(String args[])
   { 
    
    int num1,num2,sum;
    Scanner input= new Scanner(System.in);
    System.out.println("enter number 1");
    num1 = input.nextInt();
    System.out.println("enter number 2");
    num2 = input.nextInt();
    input.close();
    sum=num1+num2;
    
    
    System.out.println("sum="+sum);
   }
 }
