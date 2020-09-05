package level_a.java;

import java.io.*;
import java.util.Arrays;

public class GravityFlip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cols = Integer.parseInt(br.readLine());
        String[] col = br.readLine().split("\\s+");
        int[] heights = new int[cols];
        for (int i = 0; i < cols; i++)
            heights[i] = Integer.parseInt(col[i]);
        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++)
            System.out.print(heights[i] + " ");
    }
}
