package task.task14.task1414;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(programmingLanguages());
    }

    public static HashMap<Integer, String> programmingLanguages(){
        HashMap<Integer, String> programmingLanguages = new HashMap<>();
        programmingLanguages.put(0, "Java");
        programmingLanguages.put(1, "Go");
        programmingLanguages.put(2, "Python");
        programmingLanguages.put(3, "Kotlin");
        programmingLanguages.put(4, "JavaScript");
        programmingLanguages.put(5, "C++");
        programmingLanguages.put(6, "PHP");
        return programmingLanguages;
    }
}
