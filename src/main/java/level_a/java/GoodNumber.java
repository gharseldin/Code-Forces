package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class GoodNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        int k = Integer.parseInt(input[1]);
        Set<Integer> kSet = new HashSet<>();
        for (int i = 0; i <= k; i++)
            kSet.add(i);
        int goodNumbers = 0;
        for (int i = 0; i < Integer.parseInt(input[0]); i++) {
            if (isGoodNumber(br.readLine(), k, new HashSet<>(kSet)))
                goodNumbers++;
        }
        System.out.print(goodNumbers);
    }

    private static boolean isGoodNumber(String num, int k, Set set) {
        int number = Integer.parseInt(num);
        while (number != 0) {
            if (set.contains(number % 10)) {
                set.remove(number % 10);
            }
            number = number / 10;
        }
        if (set.isEmpty())
            return true;
        else
            return false;
    }
}
