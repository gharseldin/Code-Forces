package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinelandMail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] cities = br.readLine().split("\\s+");
        int[] cityInt = new int[cities.length];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < cities.length; i++) {
            int val = Integer.parseInt(cities[i]);
            cityInt[i] = val;
            min = Math.min(min, val);
            max = Math.max(max, val);
        }
        for (int i = 0; i < cityInt.length; i++) {
            int minPay = Integer.MAX_VALUE;
            int maxPay = Integer.MIN_VALUE;
            if (i > 0) {
                minPay = cityInt[i] - cityInt[i - 1];
                maxPay = cityInt[i] - min;
            }
            if (i < cityInt.length - 1) {
                minPay = Math.min(minPay, cityInt[i + 1] - cityInt[i]);
                maxPay = Math.max(maxPay, max - cityInt[i]);
            }
            System.out.println(minPay + " " + maxPay);
        }
    }
}
