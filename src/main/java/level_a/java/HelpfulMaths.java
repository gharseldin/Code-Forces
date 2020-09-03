package level_a.java;

import java.io.*;
import java.util.Arrays;

public class HelpfulMaths {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\+");
        Arrays.sort(input);
        StringBuilder sb = new StringBuilder();
        for(String s: input)
            sb.append(s + "+");
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
