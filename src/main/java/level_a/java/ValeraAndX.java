package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValeraAndX {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        char a = '!';
        char b = '@';
        String row = new String();
        if(length>0) {
            row = br.readLine();
            a = row.charAt(0);
            if(length>1)
                b = row.charAt(1);
        }
        if(a == b) {
            System.out.println("NO");
            return;
        }


        for(int i=0; i<length; i++){
            for(int j=0; j<row.length()/2+1; j++){
                char first = row.charAt(j);
                char second = row.charAt(row.length()-1-j);
                if(i==j || j==row.length()-i-1){
                    if(first != second || first != a ||second != a){
                        System.out.println("NO");
                        return;
                    }
                }else{
                    if(first != second || first != b ||second != b){
                        System.out.println("NO");
                        return;
                    }
                }
            }
            row = br.readLine();
        }

        System.out.println("YES");
    }
}
