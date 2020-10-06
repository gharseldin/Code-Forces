package level_a.java;

import java.io.*;

public class BowWowAndTheTimetable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int trains = 0;
        int counter = 1;
        boolean foundOne = false;
        for(int i = input.length()-1; i>=1; i--){
            if(i!=0 && input.charAt(i)=='1')
                foundOne = true;
            trains+=counter%2;
            counter++;
        }
        if(foundOne&&input.length()%2==1)
            trains++;
        System.out.print(trains);
    }
}
