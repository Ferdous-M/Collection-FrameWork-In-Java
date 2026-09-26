package Set;

import java.util.HashSet;

public class removeDuplicate {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2, 2};

        HashSet<Integer> set = new HashSet<>();
        for( int num : arr) {
            set.add(num);
        }
        System.out.println("No duplicate");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
