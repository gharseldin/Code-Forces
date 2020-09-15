package level_a.java;

import java.io.*;
import java.util.*;

public class AntonAndPolyhedrons {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int total=0;
        Map<String, Integer> map = new HashMap<>();
        map.put("Tetrahedron",4);
        map.put("Cube",6);
        map.put("Octahedron",8);
        map.put("Dodecahedron",12);
        map.put("Icosahedron",20);
        for(int i=0; i<input; i++){
            String shape = br.readLine();
            total+=map.get(shape);
        }
        System.out.println(total);
    }
}
