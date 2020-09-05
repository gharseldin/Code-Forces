package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Twins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] coins = br.readLine().split("\\s+");
        int[] coin = new int[coins.length];
        for(int i=0; i< coin.length; i++)
            coin[i] = Integer.parseInt(coins[i]);
        Arrays.sort(coin);
        int total = 0;
        for(int i : coin)
            total+=i;
        int value = 0;
        int count = 0;
        for(int i=coin.length-1; i>=0; i--){
            value+=coin[i];
            count++;
            if(value>total/2)
                break;
        }
        System.out.print(count);
    }
}
