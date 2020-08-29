package level_a.java;

import java.io.*;

public class APetyaAndString {
    public static void main(String[] args) throws IOException {
        String data = "aaaa\n" +
                "aabA";
        InputStream in = new ByteArrayInputStream(data.getBytes("UTF-8"));
        System.setIn(in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine().toLowerCase();
        String s2 = br.readLine().toLowerCase();

        int comparison = 0;
        for(int i=0; i<s1.length();i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                comparison = -1;
                break;
            }else if(s1.charAt(i) > s2.charAt(i)) {
                comparison = 1;
                break;
            }
        }
        System.out.print(comparison);
    }
}
