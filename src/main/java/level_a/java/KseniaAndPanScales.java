package level_a.java;

import java.io.*;

public class KseniaAndPanScales {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] scale = br.readLine().split("\\|");
        if (scale.length == 0)
            scale = new String[]{"",""};
        else if (scale.length == 1)
            scale = new String[]{scale[0], ""};
        String remaining = br.readLine();
        if (Math.abs(scale[0].length() - scale[1].length()) > remaining.length()
                || Math.abs(scale[0].length() - scale[1].length()) % 2 != remaining.length() % 2) {
            System.out.print("Impossible");
        } else {
            int diff = Math.abs(scale[0].length() - scale[1].length());
            if (scale[0].length() < scale[1].length())
                scale[0] = scale[0] + remaining.substring(0, diff);
            else
                scale[1] = scale[1] + remaining.substring(0, diff);
            for (int i = diff; i < remaining.length(); i += 2) {
                scale[0] = scale[0] + remaining.charAt(i);
                scale[1] = scale[1] + remaining.charAt(i + 1);
            }
            System.out.print(scale[0] + "|" + scale[1]);
        }
    }
}
