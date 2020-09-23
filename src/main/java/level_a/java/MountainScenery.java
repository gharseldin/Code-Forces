package level_a.java;

import java.io.*;

public class MountainScenery {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        String[] peaks = br.readLine().split("\\s+");
        int[] y = new int[peaks.length];
        for (int i = 0; i < peaks.length; i++)
            y[i] = Integer.parseInt(peaks[i]);
        int counter = Integer.parseInt(input[1]);
        for (int i = 1; i < peaks.length && counter > 0; i += 2) {
            if (y[i - 1] < (y[i] - 1) && y[i + 1] < (y[i] - 1)) {
                y[i]--;
                counter--;
            }
        }
        for (int i = 0; i < y.length; i++)
            System.out.print(y[i] + " ");
    }
}
