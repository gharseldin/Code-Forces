package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class ArpasHardExamAndMehrdadsNaiveCheat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int n = Integer.parseInt(br.readLine());
        if(n==0) {
            System.out.println(1);
            return;
        }

        int last = 8;
        Set<Integer> results = new HashSet<>();
        results.add(8);
        for (int i = 1; i < 11; i++) {
            last = last * 8;
            last = last % 10;
            if (results.contains(last))
                break;
            results.add(last);
        }
        int repeated = n/(results.size());
        n = n-(repeated*(results.size()));
        last = (int)Math.pow(8, results.size()+n);
        System.out.println(last%10);
    }
}
