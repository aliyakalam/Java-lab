package lab;

public class SumNatural
{
 public static void main(String[] args) 
 {
   int num = 10, sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            sum += i;
        }

        System.out.println("Sum = " + sum);
 }
}

/*
output:
Sum = 55
*/