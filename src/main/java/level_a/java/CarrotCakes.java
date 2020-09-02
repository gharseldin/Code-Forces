package level_a.java;

import java.io.*;

public class CarrotCakes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        int target = Integer.parseInt(input[0]);
        int time = Integer.parseInt(input[1]);
        int capacity = Integer.parseInt(input[2]);
        int newBuildTime = Integer.parseInt(input[3]);

        int oneTotalTime = (int) Math.ceil((double) target / (double) capacity) * time;

        int initialCooking = (int) Math.ceil((double) newBuildTime / (double) time);
        int initialVolume = initialCooking * capacity;
        int twoTotalTime = (initialVolume / capacity) * time;

        int remaining = target - initialVolume;
        int remainingTrays = (int)Math.ceil((double)remaining / (double)capacity);

        if (remainingTrays == 0 || (remainingTrays == 1 && newBuildTime % time == 0)) {
            System.out.print("NO");
        } else {
            if (remainingTrays % 2 == 0) {
                twoTotalTime += (remainingTrays / 2) * time;
            } else {
                twoTotalTime += (remainingTrays / 2) * time + newBuildTime % time;
            }
            if (twoTotalTime < oneTotalTime)
                System.out.print("YES");
            else
                System.out.print("NO");
        }
    }
}
