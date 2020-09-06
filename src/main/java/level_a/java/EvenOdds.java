package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        long num = Long.parseLong(input[0]);
        long pos = Long.parseLong(input[1]);
        long odd;
        if (num % 2 == 1) {
            odd = (num / 2) + 1;
        } else {
            odd = num / 2;
        }
        if (pos <= odd) {
            System.out.println(pos*2-1);
        } else {
            System.out.println((pos-odd)*2);
        }
    }
}
