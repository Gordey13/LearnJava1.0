package task.task13.task1322;

import java.util.ArrayList;

public class Solution {
    public static void printAnything(ArrayList arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(){{
            add(15);
            add("Hello");
            add(154);
            add("string");
        }};

        printAnything(arrayList);
    }
}
