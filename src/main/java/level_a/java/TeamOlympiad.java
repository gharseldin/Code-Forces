package level_a.java;

import java.io.*;
import java.util.*;

public class TeamOlympiad {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] input = br.readLine().split("\\s+");
        Map<String, List<Integer>> students = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            students.putIfAbsent(input[i], new ArrayList<>());
            students.get(input[i]).add(i);
        }
        if (students.size() < 3)
            System.out.print(0);
        else {
            int teams = Math.min(students.get("1").size(), students.get("2").size());
            teams = Math.min(students.get("3").size(), teams);
            System.out.println(teams);
            for (int i = 0; i < teams; i++) {
                System.out.println((students.get("1").get(i)+1) +
                        " " + (students.get("2").get(i)+1) +
                        " " + (students.get("3").get(i)+1));
            }
        }
    }
}
