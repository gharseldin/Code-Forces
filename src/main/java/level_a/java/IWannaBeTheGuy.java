package level_a.java;

import java.io.*;
import java.util.*;

public class IWannaBeTheGuy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        Set<String> levels = new HashSet<>();
        String[] x = br.readLine().split("\\s+");
        String[] y = br.readLine().split("\\s+");
        for(int i=1; i<x.length; i++)
            levels.add(x[i]);
        for(int i=1; i<y.length; i++)
            levels.add(y[i]);
        System.out.println(levels.size() == total?"I become the guy.":"Oh, my keyboard!");
    }
}
