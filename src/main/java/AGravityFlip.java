import java.io.*;
import java.util.Arrays;

public class AGravityFlip {
    public static void main(String[] args) throws IOException {
        String data = "4\n" +
                "3 2 1 2";
        InputStream in = new ByteArrayInputStream(data.getBytes("UTF-8"));
        System.setIn(in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cols = Integer.parseInt(br.readLine());
        String[] col = br.readLine().split("\\s+");
        int[] heights = new int[cols];
        for (int i = 0; i < cols; i++)
            heights[i] = Integer.parseInt(col[i]);
        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++)
            System.out.print(heights[i] + " ");
    }
}
