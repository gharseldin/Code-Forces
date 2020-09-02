package level_a.java;

import java.io.*;

public class Juicer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input  = br.readLine().split("\\s+");
        int maxSize = Integer.parseInt(input[1]);
        int wasteCapacity = Integer.parseInt(input[2]);
        String[] oranges = br.readLine().split("\\s+");
        int emptying = 0;
        int wasteVolume = 0;
        for(String orange: oranges){
            int o = Integer.parseInt(orange);
            if(o>maxSize)
                continue;
            wasteVolume += o;
            if(wasteVolume>wasteCapacity) {
                emptying++;
                wasteVolume = 0;
            }
        }
        System.out.print(emptying);
    }
}
