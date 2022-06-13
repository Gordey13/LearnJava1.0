package task.task15.task1504;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>(){{
            add("Привет");
            add("Hello");
            add("Hola");
            add("Bonjour");
            add("Cialo");
            add("Namaste");
        }};
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        if(set.contains(s)){
            System.out.println("Да, есть слово в куче объектов");
        }
    }
}
