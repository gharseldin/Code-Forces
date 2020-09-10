package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrainsPhotos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] rowsCols = br.readLine().split("\\s+");
        int rows = Integer.parseInt(rowsCols[0]);
        boolean isColor = false;
        for(int i=0; i<rows; i++){
            String row = br.readLine();
            for(int j=0; j<row.length(); j++){
                if(row.charAt(j)=='C'||row.charAt(j)=='M'||row.charAt(j)=='Y')
                    isColor = true;
            }
        }
        System.out.println(isColor?"#Color":"#Black&White\n");
    }
}
