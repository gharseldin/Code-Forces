package level_a.java;

import java.io.*;

public class WayTooLongWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        for (int i = 0; i < input; i++) {
            String word = br.readLine();
            if (word.length() > 10) {
                System.out.println(String.valueOf(word.charAt(0))+(word.length()-2)+word.charAt(word.length()-1));
            }else{
                System.out.println(word);
            }
        }
    }
}
