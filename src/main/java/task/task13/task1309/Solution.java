package task.task13.task1309;

import java.util.ArrayList;
import java.util.Arrays;


public class Solution {
    public static ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(56, 45, 89, 1, 45, 13, 4, 69, 11, -89));

    public static void main(String[] args) {
            print();
            sort();
            System.out.println("Отсортированные числа в натуральном порядке:");
            print();
    }

    public static void sort(){
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                if(numbers.get(j) > numbers.get(j + 1)){
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
    }

    public static void print(){
        for(Integer number : numbers){
            System.out.print(number + " ");
        }
    }
}
