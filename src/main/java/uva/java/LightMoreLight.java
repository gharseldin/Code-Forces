package uva.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LightMoreLight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (input != 0) {
            sb.append(isOn(input) + "\n");
            input = Integer.parseInt(br.readLine());
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb.toString());
    }

    private static String isOn(int num) {
        int sq = (int) Math.sqrt(num);
        return sq * sq == num ? "yes" : "no";
    }
}
