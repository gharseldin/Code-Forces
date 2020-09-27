package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class LaunchOfCollider {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        String directions = br.readLine();
        String[] positions = br.readLine().split("\\s+");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<input-1; i++){
            if(directions.charAt(i) == 'R' && directions.charAt(i+1) == 'L'){
                pq.add((Integer.parseInt(positions[i+1])
                        - Integer.parseInt(positions[i]))/2);
            }
        }
        if(pq.isEmpty())
            System.out.print("-1");
        else
            System.out.print(pq.peek());
    }
}
