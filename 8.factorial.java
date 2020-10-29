import java.util.*;

 // Compiler version JDK 11.0.2

 class factorial
 {
   public static void main(String args[])
   { 
    int n;
    long fact=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    n= sc.nextInt();
    for(int i=1;i<=n;++i)
    {
      fact*=i;
    }
    System.out.println(fact);
   }
 }