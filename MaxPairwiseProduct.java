import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers) {
        long result = 0;
        long n = numbers.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if ((long)((long)numbers[i] * (long)numbers[j]) > result) {
                    result = (long)((long)numbers[i] * (long)numbers[j]);
                }
            }
        }
        return result;
    }

    static long getMaxPairwiseProductFast(int[] numbers) {
        long n = numbers.length;
        long max1 = -1;
        long max2 = -1;
        int indexMax = -1;
        for (int i = 0; i < n; ++i) 
        {
            if(i == 0)
            {
            	max1 = (long)numbers[i];
            	indexMax = i;
            }
            else
            {
            	if((long)numbers[i] >= max1)
            	{
            		max1 = (long)numbers[i];
            		indexMax = i;
            	}
            }
        }
        
        for (int i = 0; i < n; ++i) 
        {
            if(i == 0 && indexMax != i)
            {
            	max2 = (long)numbers[i];
            }
            else
            {
            	if(((long)numbers[i] >= max2) && indexMax != i)
            	{
            		max2 = (long)numbers[i];
            	}
            }
        }
        
        return max1*max2;
    }
    
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProductFast(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}