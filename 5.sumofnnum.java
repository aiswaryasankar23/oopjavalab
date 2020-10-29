import java.util.*;

 // Compiler version JDK 11.0.2

 class sum_N_numbers
 {
   public static void main(String args[])
   { 
    int num,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    num = sc.nextInt();
    
    for(int i=1;i<=num;i++)
    {
      sum+=i;
    }
    System.out.println(sum);
   }
 }