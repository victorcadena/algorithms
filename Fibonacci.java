import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
	
	  if (n <= 1)
          return n;

      long previous = 0;
      long current  = 1;

      for (long i = 0; i < n - 1; ++i) {
          long tmp_previous = previous;
          previous = current;
          current = tmp_previous + current;
      }
      
      return current;
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
