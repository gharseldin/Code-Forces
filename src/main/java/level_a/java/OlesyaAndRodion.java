package level_a.java;

import java.io.*;

public class OlesyaAndRodion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input =  br.readLine().split("\\s+");
        int digits = Integer.parseInt(input[0]);
        int div = Integer.parseInt(input[1]);
        if(div == 10) {
            if(digits == 1) {
                System.out.println("-1");
            }else{
                System.out.println(div + getZeros(digits-2));
            }
        } else{
            System.out.println(div + getZeros(digits-1));
        }
    }

    private static String getZeros(int n){
        StringBuilder sb = new StringBuilder();
        for(int i= 0; i<n; i++){
            sb.append("0");
        }
        return sb.toString();
    }
}
