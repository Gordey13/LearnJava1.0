package task.task13.task1314;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
Прощай, Паскаль
*/

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {

        for (int i = 0; i < programmingLanguages.size(); i++) {
            if(programmingLanguages.get(i).equals("Pascal")){
                programmingLanguages.remove(i);
                break;
            }
        }

        for (int i = 0; i < programmingLanguages.size(); i++) {
            System.out.println(programmingLanguages.get(i));
        }

    }
}

