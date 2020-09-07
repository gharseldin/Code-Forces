package level_a.java;

import java.io.*;
import java.util.*;

public class IsItRated {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> ratings = new PriorityQueue<>();
        boolean isOrdered = true;
        boolean isChanged = false;
        for(int i= 0; i<input; i++){
            String[] rating = br.readLine().split("\\s+");
            if(!rating[0].equals(rating[1])){
                isChanged = true;
                break;
            }
            if(!ratings.isEmpty() && ratings.peek()<Integer.parseInt(rating[0])){
                isOrdered = false;
            }
            ratings.add(Integer.parseInt(rating[0]));
        }
        if(isChanged){
            System.out.println("rated");
        }else if(!isOrdered && !isChanged){
            System.out.println("unrated");
        }else{
            System.out.println("maybe");
        }
    }
}
