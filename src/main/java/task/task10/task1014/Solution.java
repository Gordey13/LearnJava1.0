package task.task10.task1014;

import java.util.Scanner;

/*
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        multiArray = new int[n][];
        for (int i = 0; i < n; i++) {
            int line = console.nextInt();
            multiArray[i] = new int[line];
        }
    }
}


