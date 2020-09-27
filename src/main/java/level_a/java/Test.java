package level_a.java;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
}

class Solution {
    public String largestNumber(int[] nums) {
        Integer[] numbers = new Integer[nums.length];
        for(int i = 0; i<nums.length; i++){
            numbers[i] = nums[i];
        }
        Arrays.sort(numbers, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                char[] first = String.valueOf(a).toCharArray();
                char[] second = String.valueOf(a).toCharArray();
                int i=0;
                int j=0;
                while(i<first.length && j<second.length){
                    if(first[i]>second[j]){
                        return -1;
                    }else if(first[i] < second[j]){
                        return 1;
                    }else{
                        i++;
                        j++;
                    }
                }
                while(i<first.length){
                    if(first[i]>second[i%second.length]){
                        return -1;
                    }else if(first[i]<second[i%second.length]){
                        return 1;
                    }else{
                        i++;
                    }
                }
                while(j<second.length){
                    if(second[j]>first[j%first.length]){
                        return 1;
                    }else if(second[j]<first[j%first.length]){
                        return -1;
                    }else{
                        j++;
                    }
                }
                return 0;
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i: nums){
            sb.append(String.valueOf(i));
        }
        return sb.toString();
    }
}
