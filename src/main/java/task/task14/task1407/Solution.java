package task.task14.task1407;

import java.util.ArrayList;
import java.util.Collections;

/*
Изучаем методы класса Collections, часть 1
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static void copy(ArrayList<String> destination, ArrayList<String> source) {

        Collections.copy(destination, source);

        if(destination.size() < source.size()){
            throw new IndexOutOfBoundsException("Размер источника превышает размер приемника");
        }
        for (int i = 0; i < destination.size(); i++) {
            destination.set(i, source.get(i));
        }
    }

    public static void addAll(ArrayList<String> list, String... strings) {

        Collections.addAll(list, strings);

        for(String string : strings){
            list.add(string);
        }
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        Collections.replaceAll(list, oldValue, newValue);

        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i);
            if(string.equals(oldValue)){
                list.set(i, newValue);
            }
        }
    }
}
