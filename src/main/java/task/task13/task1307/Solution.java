package task.task13.task1307;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Boolean a = true;
        Boolean a1 = Boolean.valueOf(true);

        int c =5;
        Integer b = Integer.valueOf(5);

        if(c == b.intValue()){

        }

        ArrayList<String> array = new ArrayList<>(10);

        array.get(0);
        array.set(0, "First"); // update
        array.add("123"); // insert
        array.remove(0); // delete

        array.size();
        array.isEmpty();
        System.out.println(array.toString());
        array.contains("123");
        array.clear();

        Scanner console = new Scanner(System.in);
        ArrayList<String> array2 = new ArrayList<>(20);
        for (int i = 0; i < array2.size(); i++)
        {
            String s = console.nextLine();
            array2.add(s);
        }
        for (int i = 0; i < array2.size(); i++)
        {
                int j = array2.size() - i - 1;
            System.out.println(array2.get(j));
        }
    }

//    public static int[] numbers = new int[10];
//    public static void init(){
//        int n = numbers.length  - 1;
//        for (int i = 0; i < numbers.length / 2; i++) {
//            numbers[i] = i;
//        }
//    }
//
//    public static void print(){
//        for(int number : numbers){
//            System.out.println(number);
//        }
//    }
//
//    public static void reverse(){
//        int n = numbers.length-1;
//        for (int i = 0; i < numbers.length / 2; i++) {
//            int temp = numbers[i];
//            numbers[i] = numbers[n - i];
//            numbers[n-i] = temp;
//        }
//    }

    public static ArrayList<Integer> numbers = new ArrayList<>(10);

    public static void init() {
        for (int i = 0; i < 10; i++) {
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
            System.out.println(number);
        }
    }

}
