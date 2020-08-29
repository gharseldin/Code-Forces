package level_a.java;

import java.io.*;

public class ATeam {
    public static void main(String[] args) throws IOException {
        String data = "3\n" +
                "1 1 0\n" +
                "1 1 1\n" +
                "1 0 0";
        InputStream in = new ByteArrayInputStream(data.getBytes("UTF-8"));
        System.setIn(in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int problems = Integer.parseInt(br.readLine());
        int sure = 0;
        for (int i = 0; i < problems; i++) {
            String[] vote = br.readLine().split("\\s+");
            int total = 0;
            for (String v : vote) {
                if (v.equals("1"))
                    total++;
                if (total == 2)
                    break;
            }
            if (total == 2)
                sure++;
        }
        System.out.print(sure);
    }
}
