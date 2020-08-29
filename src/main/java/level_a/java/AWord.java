package level_a.java;

import java.io.*;

public class AWord {
    public static void main(String[] args) throws IOException {
        String data = "HoUSe";
        InputStream in = new ByteArrayInputStream(data.getBytes("UTF-8"));
        System.setIn(in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int upper = 0;
        int lower = 0;
        for(char c: word.toCharArray()){
            if(Character.isUpperCase(c))
                upper++;
            if(Character.isLowerCase(c))
                lower++;
        }
        StringBuilder sb = new StringBuilder();
        if(upper > lower){
            for(char c :  word.toCharArray()){
                if(Character.isLowerCase(c))
                    sb.append(Character.toUpperCase(c));
                else
                    sb.append(c);
            }
        }else{
            for(char c :  word.toCharArray()){
                if(Character.isUpperCase(c))
                    sb.append(Character.toLowerCase(c));
                else
                    sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
