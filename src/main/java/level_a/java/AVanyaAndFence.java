package level_a.java;

import java.io.*;

public class AVanyaAndFence {
    public static void main(String[] args) throws IOException {
        String data = "3 7\n" +
                "4 5 14";
        InputStream in = new ByteArrayInputStream(data.getBytes("UTF-8"));
        System.setIn(in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        int friends = Integer.parseInt(input[0]);
        int fenceHeight = Integer.parseInt(input[1]);
        int width = 0;
        String[] friendHeights = br.readLine().split("\\s+");
        for (int i = 0; i < friends; i++) {
            int height = Integer.parseInt(friendHeights[i]);
            width += height <= fenceHeight ? 1 : 2;
        }
        System.out.print(width);
    }
}
