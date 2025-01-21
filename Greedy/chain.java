package Greedy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class chain {
    public static void main(String[] args) {
        int pairs[][] = {{5, 24} , {39,60},{5, 28}, {27, 40}, {50, 90}}; 

        Arrays.sort(pairs, Comparator.comparing(o -> o[1]));


        int chainlen = 1;
        int Pairend = pairs[0][1];



    }
}
