package level_a.java;

import java.io.*;

public class BeautifulMatrix {
    public static void main(String[] args) throws IOException {
        String data = "0 0 0 0 0\n" +
                "0 0 0 0 1\n" +
                "0 0 0 0 0\n" +
                "0 0 0 0 0\n" +
                "0 0 0 0 0";
        InputStream in = new ByteArrayInputStream(data.getBytes("UTF-8"));
        System.setIn(in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] pos = new int[2];
        for(int i=1; i<=5; i++){
            String[] line = br.readLine().split("\\s+");
            for(int j=0; j<5; j++) {
                if (line[j].equals("1")) {
                    pos = new int[]{i, j+1};
                    break;
                }
            }
        }

        int moves = 0;
        moves += Math.abs(pos[0]-3);
        moves += Math.abs(pos[1]-3);
        System.out.print(moves);
    }
}
