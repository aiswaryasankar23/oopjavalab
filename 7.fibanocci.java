import java.util.*;

 // Compiler version JDK 11.0.2

 class fibonacci
 {
   public static void main(String args[])
   { 
    int n=5,n1=0,n2=1;
    for(int i=1;i<=n;i++)
    {
       System.out.println(n1+" ");
       int sum=n1+n2;
       n1=n2;
       n2=sum;
    }
   }
   }
   