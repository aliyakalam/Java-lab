
package lab;
public class Prime
{
public static void main(String[] args) {
 int n=8,i,flag=0;
 for(i=2;i<n;i++)
    {
     if(n%i==0)
           flag=1;
    }
 if(flag==1) System.out.println("Number is not   prime");

     else     System.out.println("Number is  prime");
}
}

/* 
output:
Number is not   prime
*/