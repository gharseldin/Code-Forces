package level_a.java;

import java.io.*;

public class FreeIceCream {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        int queue = Integer.parseInt(input[0]);
        long iceCream = Long.parseLong(input[1]);
        int distressed = 0;
        for (int i = 0; i < queue; i++) {
            String[] person = br.readLine().split("\\s+");
            int amount = Integer.parseInt(person[1]);
            if (person[0].equals("+")) {
                iceCream += amount;
            } else {
                if (amount > iceCream) {
                    distressed++;
                } else {
                    iceCream -= amount;
                }
            }
        }
        System.out.println(iceCream + " " + distressed);
    }
}
