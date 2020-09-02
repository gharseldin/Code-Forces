package level_a.java;

import java.io.*;
import java.util.*;

public class AntonAndLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String input = br.readLine();
        Set<Integer> set = new HashSet<>();
        for (char a : input.toCharArray())
            if (a - 'a' >= 0 && a - 'a' <= 25)
                set.add(a-'a');
        System.out.print(set.size());
    }
}
