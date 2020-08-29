import java.io.*;

public class ABoyOrGirl {
    public static void main(String[] args) throws IOException {
        String data = "wjmzbmr";
        InputStream in = new ByteArrayInputStream(data.getBytes("UTF-8"));
        System.setIn(in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int count = 0;
        boolean[] letters = new boolean[26];
        for (char c : name.toCharArray()) {
            if (!letters[c - 'a'])
                count++;
            letters[c - 'a'] = true;
        }
        if (count % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
