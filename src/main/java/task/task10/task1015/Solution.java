package task.task10.task1015;

import java.util.Arrays;

/*
Делим массив на две части 14.05
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        int length = array.length;
        int firstPart = length % 2 == 0 ? length / 2 : length / 2 + 1;

        result[0] = Arrays.copyOfRange(array, 0, firstPart);
        result[1] = Arrays.copyOfRange(array, firstPart, length);

        System.out.println(Arrays.deepToString(result));
    }
}


