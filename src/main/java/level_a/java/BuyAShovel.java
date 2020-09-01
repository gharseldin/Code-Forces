package level_a.java;

import java.io.*;

public class BuyAShovel {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        int price = Integer.parseInt(input[0]);
        int change = Integer.parseInt(input[1]);
        for(int i=1; i<=10; i++){
            if((i*price)%10 == 0 || (i*price-change)%10 == 0) {
                System.out.print(i);
                break;
            }
        }
    }
}
