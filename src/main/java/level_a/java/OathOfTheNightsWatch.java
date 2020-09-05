package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OathOfTheNightsWatch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] stewards = br.readLine().split("\\s+");
        int[] steward = new int[stewards.length];
        for (int i = 0; i < steward.length; i++) {
            steward[i] = Integer.parseInt(stewards[i]);
        }
        Arrays.sort(steward);
        int i = 0;
        int j = steward.length - 1;
        while (i < stewards.length - 1 && steward[i] == steward[i + 1])
            i++;
        while (j > 0 && steward[j] == steward[j - 1])
            j--;
        if (i >= j || j-i == 1)
            System.out.print(0);
        else
            System.out.print(j-i-1);
    }
}
