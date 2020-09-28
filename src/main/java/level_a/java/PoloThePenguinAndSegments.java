package level_a.java;

import java.io.*;

public class PoloThePenguinAndSegments {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        int in = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int covered = 0;
        for (int i = 0; i < in; i++) {
            String[] range = br.readLine().split("\\s+");
            covered +=  Integer.parseInt(range[1])-Integer.parseInt(range[0])+1;
        }
        int remain = k-(covered % k);
        System.out.print(remain==k?0:remain);
    }
}
