package level_a.java;

import java.io.*;

public class AAntonDanik {
    public static void main(String[] args) throws IOException {
        String data = "6\n" +
                "ADAAAA";
        InputStream in = new ByteArrayInputStream(data.getBytes("UTF-8"));
        System.setIn(in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int games = Integer.parseInt(br.readLine());
        String results = br.readLine();
        int antonCount = 0;
        int danikCount = 0;
        for(int i=0; i<games; i++) {
            char c = results.charAt(i);
            if (results.charAt(i) == 'A')
                antonCount++;
            else
                danikCount++;
        }
        if(antonCount == danikCount)
            System.out.print("Friendship");
        else if(antonCount > danikCount)
            System.out.print("Anton");
        else
            System.out.print("Danik");
    }
}
