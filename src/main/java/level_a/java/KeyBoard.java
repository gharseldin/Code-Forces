package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Position{
    int row;
    int position;
    Position(int r, int p){
        row = r;
        position = p;
    }
}
public class KeyBoard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String shift = br.readLine();
        Map<Character, Position> keyBoard = getKeyBoard();
        int move = shift.equals("R")?-1:1;
        String input = br.readLine();
        StringBuilder output = new StringBuilder();
        for(char c: input.toCharArray()){
            Position p = keyBoard.get(c);
            output.append(getPosition(new Position(p.row, p.position+move)));
        }
        System.out.println(output.toString());
    }

    private static Map<Character, Position> getKeyBoard(){
        Map<Character, Position> keyBoard = new HashMap<>();
        String[] keys = {"qwertyuiop","asdfghjkl;", "zxcvbnm,./"};
        for(int i=0; i<keys.length; i++){
            String row = keys[i];
            for(int j=0; j<row.length(); j++){
                keyBoard.put(row.charAt(j), new Position(i,j));
            }
        }
        return keyBoard;
    }

    private static char getPosition(Position p){
        String[] keys = {"qwertyuiop","asdfghjkl;", "zxcvbnm,./"};
        return keys[p.row].charAt(p.position);
    }
}
