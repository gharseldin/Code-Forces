package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Counterexample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        long start = Long.parseLong(input[0]);
        long end = Long.parseLong(input[1]);
        for (long i = start; i <= end - 2; i++) {
            for (long j = i + 1; j <= end - 1; j++) {
                for (long k = j + 1; k <= end; k++) {
                    if(isCoPrime(i,j) && isCoPrime(j,k) && !isCoPrime(i,k)) {
                        System.out.print(i + " " + j + " " + k);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }

    private static boolean isCoPrime(long i, long j){
        if(gcd(j,i) == 1)
            return true;
        return false;
    }

    private static long gcd(long a, long b){
        if(b == 0)
            return a;
        else
            return gcd(b, a%b);
    }
}
