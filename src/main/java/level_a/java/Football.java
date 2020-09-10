package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Football {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        Map<String, Integer> score = new HashMap<>();
        for(int i=0; i<input; i++){
            String team = br.readLine();
            score.put(team, score.getOrDefault(team, 0)+1);
        }
        String winner = "";
        int value = 0;
        for(Map.Entry<String, Integer> entry: score.entrySet()){
            if(entry.getValue()>value) {
                value = entry.getValue();
                winner = entry.getKey();
            }
        }
        System.out.print(winner);
    }
}
