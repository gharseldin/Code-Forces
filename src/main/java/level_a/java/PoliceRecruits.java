package level_a.java;

import java.io.*;

public class PoliceRecruits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] events = br.readLine().split("\\s+");
        int crimes = 0;
        int availablePolice = 0;
        for(String event: events){
            int e = Integer.parseInt(event);
            if(e < 0){
                if(availablePolice >0)
                    availablePolice--;
                else
                    crimes++;
            }else{
                availablePolice+=e;
            }
        }
        System.out.println(crimes);
    }
}
