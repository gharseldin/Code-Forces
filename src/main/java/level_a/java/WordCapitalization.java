package level_a.java;

import java.io.*;

public class WordCapitalization {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.print(input.substring(0,1).toUpperCase()+input.substring(1));
    }
}
