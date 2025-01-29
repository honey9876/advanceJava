package placementQuestion;

import java.util.HashSet;

public class PairsWithSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 2, 3};
        int target = 7;
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("(" + num + ", " + complement + ")");
            }
            seen.add(num);
        }
    }
}
