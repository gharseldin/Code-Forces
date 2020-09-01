package level_a.java;

import java.io.*;

public class NightAtTheMuseum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        char last = 'a';
        int moves = 0;
        for(char c: word.toCharArray()){
            int right = Math.abs(c-last);
            int left = 26-right;
            moves+=Math.min(right, left);
            last = c;
        }
        System.out.println(moves);
    }
}
