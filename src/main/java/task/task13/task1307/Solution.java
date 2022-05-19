package task.task13.task1307;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static ArrayList<Integer> numbers = new ArrayList<>(100);

    public static void main(String[] args) {

//        Boolean a = true;
//        Boolean a1 = Boolean.valueOf(true);
//
//        int c =5;
//        Integer b = Integer.valueOf(5);
//
//        if(c == b.intValue()){
//
//        }
//
//        ArrayList<String> array = new ArrayList<>(10);
//
//        array.get(0);
//        array.set(0, "First"); // update
//        array.add("123"); // insert
//        array.remove(0); // delete
//
//        array.size();
//        array.isEmpty();
//        System.out.println(array.toString());
//        array.contains("123");
//        array.clear();
//
//        Scanner console = new Scanner(System.in);
//        ArrayList<String> array2 = new ArrayList<>(20);
//        for (int i = 0; i < array2.size(); i++)
//        {
//            String s = console.nextLine();
//            array2.add(s);
//        }
//        for (int i = 0; i < array2.size(); i++)
//        {
//                int j = array2.size() - i - 1;
//            System.out.println(array2.get(j));
//        }

        init();
        print();
        reverse();
        System.out.println("\nОтсортированные числа в натуральном порядке:");
        print();

    }

    public static int[] numbers1 = new int[100];
    public static void init1(){
        int n = numbers1.length  - 1;
        for (int i = 0; i < numbers1.length / 2; i++) {
            numbers1[i] = i;
        }
    }

    public static void print1(){
        for(int number : numbers1){
            System.out.println(number);
        }
    }

    public static void reverse1(){
        int n = numbers1.length-1;
        for (int i = 0; i < numbers1.length / 2; i++) {
            int temp = numbers1[i];
            numbers1[i] = numbers1[n - i];
            numbers1[n-i] = temp;
        }
    }


    public static void init() {
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        int n = numbers.size() - 1;
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(n-i));
            numbers.set(n - i, temp);
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.print(number+" ");
        }
    }

}