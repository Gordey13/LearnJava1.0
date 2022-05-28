package task.task14.task1401;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet){
            System.out.println(s);
        }
    }
    public static HashSet<String> arrayToHashSet(String[] strings){
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < strings.length; i++) {
            hashSet.add(strings[i]);
        }
        return hashSet;
    }

    public static HashSet<String> arrayAsToHashSet(String[] strings){
        return new HashSet<>(Arrays.asList(strings));
    }

}
