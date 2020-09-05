package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pangram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String test = br.readLine();
        boolean[] chars = new boolean[26];
        for (char c : test.toCharArray())
            chars[Character.toLowerCase(c) - 'a'] = true;
        System.out.print(containsAllLetters(chars) ? "YES" : "NO");
    }

    private static boolean containsAllLetters(boolean[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (!chars[i])
                return false;
        }
        return true;
    }
}
