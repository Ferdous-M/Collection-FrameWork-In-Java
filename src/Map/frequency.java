package Map;

import java.util.HashMap;

public class frequency {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 2};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : arr) {
           if(freq.containsKey(num)) {
               freq.put(num,freq.get(num)+1);
           }
           else {
               freq.put(num,1);
           }
        }
        System.out.println("freq array: " + freq);
        //System.out.println(freq);
    }
}