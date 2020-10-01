package level_a.java;

import java.io.*;
import java.util.*;

public class YaroslavAndPermutations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] input = br.readLine().split("\\s+");
        Map<String, Integer> count = new HashMap<>();
        for(String i: input)
            count.put(i, count.getOrDefault(i,0)+1);
        int threshold = input.length/2 + input.length%2;
        boolean possible = true;
        for(Map.Entry<String, Integer> entry: count.entrySet())
            if(entry.getValue()> threshold)
                possible = false;
        System.out.print(possible?"YES":"NO");
    }
}
