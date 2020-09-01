package level_a.java;

import java.io.*;

public class ColorfulStonesSimple {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String wall = br.readLine();
        String instructions = br.readLine();
        int i=0;
        int j=0;
        int position = 1;
        while(i<instructions.length()){
            if(instructions.charAt(i) == wall.charAt(j)) {
                position++;
                j++;
            }
            i++;
        }
        System.out.print(position);
    }
}
