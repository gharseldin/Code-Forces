package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AGames {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int teams = Integer.parseInt(br.readLine());
        List<String[]> uniforms = new ArrayList<>();
        for(int i = 0; i<teams; i++) {
            String[] team = br.readLine().split("\\s+");
            uniforms.add(team);
        }
        int times = 0;
        for(int i=0; i<teams-1; i++){
            for(int j=i+1; j<teams; j++){
                if(uniforms.get(i)[0].equals(uniforms.get(j)[1]))
                    times++;
                if(uniforms.get(i)[1].equals(uniforms.get(j)[0]))
                    times++;
            }
        }
        System.out.print(times);
    }
}
