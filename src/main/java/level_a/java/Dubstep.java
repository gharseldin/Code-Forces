package level_a.java;

import java.io.*;

public class Dubstep {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] tokens = input.split("WUB");
        StringBuilder sb = new StringBuilder();
        for(String s: tokens) {
            sb.append(!s.equals("")?s+" ":"");
        }
        System.out.print(sb.toString());
    }
}
