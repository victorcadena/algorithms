import java.util.*;

public class LCM {
  private static long lcm_naive(int a, int b)
  {
	  long gcd = gcd_naive(a, b);
	  return (long)a*(long)b/gcd;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
  }
  
  
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
}
