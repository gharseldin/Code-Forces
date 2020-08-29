package level_a.java;

import java.io.*;

public class AMangnets {
    public static void main(String[] args) throws IOException {
        String data = "6\n" +
                "10\n" +
                "10\n" +
                "10\n" +
                "01\n" +
                "10\n" +
                "10";
        InputStream in = new ByteArrayInputStream(data.getBytes("UTF-8"));
        System.setIn(in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int groups = 0;
        char prev = '!';
        if(input > 0) {
            String magnet =br.readLine();
            prev = magnet.charAt(0);
            groups++;
        }
        for(int i= 1; i < input; i++){
            String magnet = br.readLine();
            if(magnet.charAt(0) != prev){
                prev = magnet.charAt(0);
                groups++;
            }
        }
        System.out.print(groups);
    }
}
