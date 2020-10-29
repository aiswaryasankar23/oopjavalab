import java.util.*;

 // Compiler version JDK 11.0.2

 class factor
 {
   public static void main(String args[])
   { 
    int num=40;
    System.out.println("The factors of given number");
    for(int i=1;i<=num;++i)
    {
      if(num % i==0)
         System.out.println(i+"is a factor");
    }
   }
 }