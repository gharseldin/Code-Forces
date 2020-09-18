package level_a.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVAProduct {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first;
        while ((first = br.readLine()) != null) {
            String second = br.readLine();
            System.out.println(product(first, second));
        }
    }

    private static String product(String first, String second) {
        if (first.length() > second.length()) {
            String temp = first;
            first = second;
            second = temp;
        }
        String result = multiply(first.charAt(first.length() - 1), second);
        int count = 1;
        for (int i = first.length() - 2; i >= 0; i--) {
            String row = multiply(first.charAt(i), second);
            result = add(result, row, count++);
        }
        return result;
    }

    private static String multiply(char a, String num) {
        int n = Integer.parseInt(String.valueOf(a));
        int carry = 0;
        StringBuilder result = new StringBuilder();
        for (int i = num.length() - 1; i >= 0; i--) {
            int temp = n * Integer.parseInt(String.valueOf(num.charAt(i))) + carry;
            result.append(temp % 10);
            carry = temp / 10;
        }
        if (carry != 0)
            result.append(carry);
        return result.reverse().toString();
    }

    private static String add(String a, String b, int count) {
        int carry = 0;
        StringBuilder bsb = new StringBuilder(b);
        for(int i=0; i<count; i++)
            bsb.append("0");
        b = bsb.toString();
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 && j >= 0) {
            int temp = Integer.parseInt(String.valueOf(a.charAt(i)))
                    + Integer.parseInt(String.valueOf(b.charAt(j))) + carry;
            result.append(temp % 10);
            carry = temp / 10;
            i--;
            j--;
        }
        while (i >= 0) {
            int temp = Integer.parseInt(String.valueOf(a.charAt(i))) + carry;
            result.append(temp % 10);
            carry = temp / 10;
            i--;
        }
        while (j >= 0) {
            int temp = Integer.parseInt(String.valueOf(b.charAt(j))) + carry;
            result.append(temp % 10);
            carry = temp / 10;
            j--;
        }
        if(carry!=0){
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
