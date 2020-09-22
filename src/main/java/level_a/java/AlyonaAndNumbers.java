package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlyonaAndNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        // for each digit 1+4, 9, 14,
        long[] nMods = new long[5];
        long[] mMods = new long[5];
        for (int i = 1; i <= n; i++)
            nMods[i % 5]++;
        for (int i = 1; i <= m; i++)
            mMods[i % 5]++;
        long result = nMods[0] * mMods[0] +
                nMods[1] * mMods[4] +
                nMods[2] * mMods[3] +
                nMods[3] * mMods[2] +
                nMods[4] * mMods[1];
        System.out.println(result);
    }
}
