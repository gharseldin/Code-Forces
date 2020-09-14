package level_a.java;

import java.io.*;

public class CalculatingFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        if(num%2 == 1){
            System.out.println("-"+(num/2+1));
        }else{
            System.out.println(num/2);
        }
    }
}
