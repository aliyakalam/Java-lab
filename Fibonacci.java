package lab;

public class Fibonacci
{
 public static void main(String[] args)       
 {
      int a=0,b=0,c=1,n=6,i;
      System.out.println("Fibonacci sequence is: ");
      for(i=1;i<=n;i++)
      {
      a=b;
      b=c;
      c=a+b;
      System.out.println(a+" ");
      }
 }
}


/*
output:
Fibonacci sequence is: 
0 
1 
1 
2 
3 
5 
*/
