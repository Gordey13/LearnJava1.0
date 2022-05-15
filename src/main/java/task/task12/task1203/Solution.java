package task.task12.task1203;

/*
Точка и запятая
*/

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    private static int salary;

    public static void add(int increase){
        salary = salary + increase;
    }

    public static void main(String[] args) {
        int number = 1;
        System.out.println(number);

        String string = "Amigo";
        System.out.println(string);

        if (System.getProperty("os.name").toLowerCase().contains("windows"))
                System.out.println("Windows detected!");

        if (number < 5) {
            System.out.println("number < 5");
        } else {
            System.out.println();
        }
        String name = "Dieogo";
        int age = 35;
        System.out.println("Name : " + name + " Age : " + age);

        Scanner console = new Scanner(System.in);
        String stringNew = console.nextLine();
        System.out.println(stringNew.toLowerCase());

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        Solution.add(100500);
        System.out.println(Solution.salary);

    }
    public static void mainDebug(String[] args) {
        System.out.println("It works!");
    }
}
