package level_a.java;

import java.io.*;

public class AStoneOnATable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String stones = br.readLine();
        int removed = 0;
        for (int i = 1; i < stones.length(); i++)
            if (stones.charAt(i) == stones.charAt(i - 1))
                removed++;
        System.out.println(removed);
    }
}
