package level_a.java;

import java.io.*;

public class BalancedRatingChanges {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        boolean ceil = true;
        for (int i = 0; i < input; i++) {
            int line = Integer.parseInt(br.readLine());
            if (line % 2 == 1) {
                line /= 2;
                line += ceil ? 1 : 0;
                ceil = !ceil;
            } else if (line % 2 == -1) {
                line /= 2;
                line += ceil ? 0 : -1;
                ceil = !ceil;
            } else {
                line /= 2;
            }
            System.out.println(line);
        }
    }
}
