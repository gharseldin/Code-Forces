package level_a.java;

import java.io.*;

public class NewPassword {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input= br.readLine().split("\\s+");
        int length = Integer.parseInt(input[0]);
        int distinct = Integer.parseInt(input[1]);
        int position = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<length;i++)
            sb.append((char)((position++%distinct)+'a'));
        System.out.println(sb.toString());
    }
}
