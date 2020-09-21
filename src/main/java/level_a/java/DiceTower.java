package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class DiceTower {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int top = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        set.add(top);
        set.add(7-top);
        for(int i=0; i<input; i++){
            String[] row = br.readLine().split("\\s+");
            if(set.contains(Integer.parseInt(row[0]))|| set.contains(Integer.parseInt(row[1]))){
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
    }
}
