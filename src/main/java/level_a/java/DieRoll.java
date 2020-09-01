package level_a.java;

import java.io.*;

public class DieRoll {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] rolls = br.readLine().split("\\s+");
        int first = Integer.parseInt(rolls[0]);
        int second = Integer.parseInt(rolls[1]);
        int max = Math.max(first, second);
        int chances = 6-max+1;
        int HCD = highestCommonDivisor(chances, 6);
        System.out.printf("%d/%d",chances/HCD, 6/HCD);
    }

    private static int highestCommonDivisor(int a, int b){
        int low = Math.min(a, b);
        int high = Math.max(a, b);
        if(high%low == 0) {
            return low;
        }else{
            int diff = high - low;
            return highestCommonDivisor(diff, low);
        }
    }
}
