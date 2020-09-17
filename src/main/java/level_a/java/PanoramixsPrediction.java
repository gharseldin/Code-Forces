package level_a.java;

import java.io.*;

public class PanoramixsPrediction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        int first = Integer.parseInt(input[0]);
        while(true){
            first++;
            if(isPrime(first))
                break;
        }
        if(String.valueOf(first).equals(input[1])){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }

    private static boolean isPrime(int num){
        for(int i=2; i<num; i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }
}
