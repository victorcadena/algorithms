import java.util.*;

public class GCD {
  private static int gcd_naive(int a, int b) {
	int retorno = 0;
    if(b==0)
    {
    	retorno = a;
    	return retorno;
    }
    else
    {
    	retorno = gcd_naive(b,a%b);
    }
    
    return retorno;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd_naive(a, b));
  }
}
