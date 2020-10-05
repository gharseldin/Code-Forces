package level_a.java;

import java.io.*;

public class RaisingBacteria {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int seeds = 0;
        while (num > 0) {
            if (num % 2 == 1)
                seeds++;
            num/=2;

        }
        System.out.print(seeds);
    }
}
