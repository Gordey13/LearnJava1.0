package task.task15.task1503;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Object o = new Scanner(System.in);
        Scanner console = (Scanner) o;

        int x = console.nextInt();

        ArrayList<String> name = new ArrayList<String>() {{
            add("He");
            add("llo");
            add("Wo");
            add("rld");
            add("!!!");
            add("Have are");
            add("you???");
        }};

        for (int i = 0; i < name.size(); i++) {
            if (name.get(i) instanceof String) {
                String s = (String) name.get(i);
                System.out.println(s);
            }
        }

        Object object = new String();
        // нет доступа к методам класса String
        String string = (String) new Object();
        // Приведение к типу (String) есть доступ к описанию класса String

    }
}
