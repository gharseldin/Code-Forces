package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IQTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] matrix = new char[4][4];
        for(int i=0; i<4; i++){
            String line = br.readLine();
            for(int j=0; j<4; j++)
                matrix[i][j] = line.charAt(j);
        }
        boolean result = false;
        for(int i=0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(square(i, j, matrix))
                    result = true;
            }
        }
        System.out.print(result?"YES":"NO");
    }

    private static boolean square(int i, int j, char[][] matrix){
        int[] colors = new int[2];
        for(int x = i; x<i+2; x++){
            for( int y = j; y<j+2; y++){
                colors[matrix[x][y]=='.'?0:1]++;
            }
        }
        if(colors[0] == 0 || colors[0] == 1 || colors[0] == 3 || colors[0] == 4)
            return true;
        return false;
    }
}
