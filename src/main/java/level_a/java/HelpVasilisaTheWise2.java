package level_a.java;

import java.io.*;
import java.util.*;

public class HelpVasilisaTheWise2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] rows = br.readLine().split("\\s+");
        String[] cols = br.readLine().split("\\s+");
        String[] diagonals = br.readLine().split("\\s+");
        int row1 = Integer.parseInt(rows[0]);
        List<int[]> possibilities = new ArrayList<>();
        for(int i=1; i<row1; i++){
            if(i!=row1-i && row1-i<10 && i<10)
                possibilities.add(new int[]{i,row1-i});
        }
        List<int[]> possibilities2 = new ArrayList<>();
        int row2 = Integer.parseInt(rows[1]);
        for(int i=1; i<row2; i++){
            if(i!=row2-i && row2-i<10 && i<10)
                possibilities2.add(new int[]{i,row2-i});
        }
        List<int[][]> combinations = new ArrayList<>();
        for(int[] possible: possibilities){
            for(int[] possible2: possibilities2){
                if(possible[0]!= possible2[0] && possible[0]!= possible2[1]
                && possible[1]!= possible2[0] && possible[1]!= possible2[1]) {
                    int[][] comb = {possible, possible2};
                    combinations.add(comb);
                }
            }
        }
        for(int[][] comb: combinations){
            if(comb[0][0]+comb[1][0] == Integer.parseInt(cols[0])
            && comb[0][1]+comb[1][1] == Integer.parseInt(cols[1])
            && comb[0][0]+comb[1][1] == Integer.parseInt(diagonals[0])
            && comb[0][1]+comb[1][0] == Integer.parseInt(diagonals[1])) {
                System.out.println(comb[0][0] + " " + comb[0][1]);
                System.out.println(comb[1][0] +  " "+ comb[1][1]);
                return;
            }
        }
        System.out.println("-1");
    }
}
