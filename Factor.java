package lab;

public class Factor 
{
  public static void main(String[] args)
  {
    int num = 15;
    System.out.print("Factors of " + num + " are: ");
    for (int i = 1; i <= num ; ++i) 
    {
      if (num % i == 0)
      {
        System.out.print(i + " ");
      }
    }
  }
}

/*
output:
Factors of 15 are: 1 3 5 15 
*/

