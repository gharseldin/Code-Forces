package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Snacktower {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        String[] sweets = br.readLine().split("\\s+");
        int max = sweets.length;
        for (int i = 0; i < sweets.length; i++) {
            int val = Integer.parseInt(sweets[i]);
            if (val == max) {
                StringBuilder line = new StringBuilder();
                line.append(max-- + " ");
                while (!pq.isEmpty() && pq.peek() == max) {
                    line.append(pq.poll() + " ");
                    max--;
                }
                line.deleteCharAt(line.length() - 1);
                System.out.println(line.toString());
            } else {
                pq.add(val);
                System.out.println();
            }
        }
    }
}
