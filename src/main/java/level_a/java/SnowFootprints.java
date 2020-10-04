package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnowFootprints {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String input = br.readLine();
        int s = -1;
        int t = -1;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '.') {
                continue;
            } else if (c == 'L') {
                if (s == -1 && t == -1) {
                    t = i;
                }
                while (input.charAt(i) == 'L') {
                    i++;
                }
                s = i;
                break;
            } else {
                if (s == -1 && t == -1) {
                    s = i + 1;
                }
                while (input.charAt(i) == 'R') {
                    i++;
                }
                if (input.charAt(i) == '.') {
                    t = i + 1;
                    break;
                } else if (input.charAt(i) == 'L') {
                    t = i;
                    break;
                }
            }
        }
        System.out.print(s + " " + t);
    }
}
