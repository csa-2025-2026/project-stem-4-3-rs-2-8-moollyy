import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here

    // prob 1
    int num = 1; 
    for (int count = 1; count <= 25; count+=2) // in the loop when count is leess than 25
    {
      System.out.println(count);
    }

  }

  // //prob 2

  // int counter = 1;
  // for (int i = 17; i <= 73; i++) 
  // {
  //   System.out.print(i + " ");

  //   if (counter == 10)
  //   {
  //     System.out.println();
  //     counter = 0; 

  //   }

  //   counter++;
  // }

  // // prob 
  // int num = 0;
  // for (int i = 0; i <= 50; i++)
  // {
  //   System.out.println(i + " ");

  //   if counter (counter == 5)
  //   {
  //     System.out.println();
  //     counter = 0; 
  //   }
  // }

  int user_input = 23;
  int counter = 1; 
  for (int i = user_input; i <= 50; i++)
  {
    System.out.print(i + " ");
    if (counter == 5)
    {
      counter = 0;
      System.out.println();
    }
    counter++;
  }

}
