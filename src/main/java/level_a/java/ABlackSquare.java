package level_a.java;

import java.io.*;

public class ABlackSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] calories = br.readLine().split("\\s+");
        String game = br.readLine();
        int totalCalories = 0;
        for(char move: game.toCharArray()){
            totalCalories+=Integer.parseInt(calories[move-'0'-1]);
        }
        System.out.print(totalCalories);
    }
}
