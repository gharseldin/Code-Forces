package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Presents {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] gifts = br.readLine().split("\\s+");
        int[] out = new int[gifts.length];
        for(int i=0; i< gifts.length; i++) {
            out[Integer.parseInt(gifts[i])-1] = i+1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<out.length; i++){
            sb.append(out[i]+" ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
