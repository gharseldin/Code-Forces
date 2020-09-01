package level_a.java;

import java.io.*;
import java.util.*;

public class IsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] colors = br.readLine().split("\\s+");
        Set<String> set = new HashSet<>();
        for(String color: colors) {
            set.add(color);
        }
        System.out.print(colors.length - set.size());
    }
}
