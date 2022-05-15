package task.task10.task1016;

import java.util.Arrays;

/*
Бинанрный поиск в массиве возвращает Индекс элемента в массиве со значением 5;
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
            int[] copy = Arrays.copyOf(array, array.length);
            Arrays.sort(copy);
            int index = Arrays.binarySearch(copy, element);
            System.out.println(index >= 0);
    }
}


