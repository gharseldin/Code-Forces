package level_a.java;

import java.io.*;

public class SerejaAndDima {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] cards = br.readLine().split("\\s+");
        int[] players = new int[2];
        int i=0;
        int j=cards.length-1;
        for(int k=0; k<cards.length; k++){
            if(Integer.parseInt(cards[i])> Integer.parseInt(cards[j])){
                players[k % 2] += Integer.parseInt(cards[i]);
                i++;
            }else{
                players[k % 2] += Integer.parseInt(cards[j]);
                j--;
            }
        }
        System.out.printf("%d %d", players[0], players[1]);
    }
}
