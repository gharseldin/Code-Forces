package level_a.java;

import java.io.*;

public class ShaassAndOskols {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] birds = br.readLine().split("\\s+");
        int[] lines = new int[birds.length];
        for (int i = 0; i < lines.length; i++)
            lines[i] = Integer.parseInt(birds[i]);
        int shots = Integer.parseInt(br.readLine());
        for (int i = 0; i < shots; i++) {
            String[] shot = br.readLine().split("\\s+");
            int line = Integer.parseInt(shot[0]) - 1;
            int position = Integer.parseInt(shot[1]);
            int left = position - 1;
            int right = lines[line] - position;
            lines[line] = 0;
            if (line - 1 >= 0) {
                lines[line - 1] += left;
            }
            if ((line + 1) < lines.length) {
                lines[line + 1] += right;
            }
        }
        for (int i = 0; i < lines.length; i++)
            System.out.println(lines[i]);
    }
}
