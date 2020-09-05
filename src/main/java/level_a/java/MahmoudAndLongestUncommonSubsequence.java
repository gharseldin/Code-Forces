package level_a.java;

import java.io.*;

public class MahmoudAndLongestUncommonSubsequence {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        if (a.equals(b))
            System.out.print(-1);
        else if (a.length() >= b.length()) {
            System.out.println(a.length());
        } else {
            System.out.println(b.length());
        }
    }
}