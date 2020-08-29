package level_a.java;

import java.io.*;

public class ABearAndBigBrother {
    public static void main(String[] args) throws IOException {
        String data = "4 7";
        InputStream in = new ByteArrayInputStream(data.getBytes("UTF-8"));
        System.setIn(in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] weights = br.readLine().split("\\s");
        int a = Integer.parseInt(weights[0]);
        int b = Integer.parseInt(weights[1]);
        int years = 0;
        while (a <= b) {
            years++;
            a *= 3;
            b *= 2;
        }
        System.out.print(years);
    }
}
