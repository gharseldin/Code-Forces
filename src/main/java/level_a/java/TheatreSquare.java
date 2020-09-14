package level_a.java;

import java.io.*;

public class TheatreSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        long length = Long.parseLong(input[0]);
        long width = Long.parseLong(input[1]);
        long stone = Long.parseLong(input[2]);

        long rows = width/stone + ((width%stone!=0)?1:0);
        long cols = length/stone + ((length%stone!=0)?1:0);

        System.out.println(rows*cols);
    }
}
