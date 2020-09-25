package level_a.java;

import java.io.*;

public class ChewbaсcaAndNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            if (digit > 4 && digit < 10) {
                if (i == 0 && digit == 0)
                    sb.append(digit);
                else
                    sb.append(9 - digit);

            } else {
                sb.append(digit);
            }
        }
        System.out.print(sb.toString());
    }
}
