package task.task14.task1403;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void print(HashSet<String> words){
        Iterator<String> iterator = words.iterator();
        while(iterator.hasNext()){
            String word = iterator.next();
            System.out.println(word);
        }

        Iterator<String> iterator1 = words.iterator();
        while(iterator1.hasNext()){
            String word = iterator1.next();
            System.out.println(word);
        }

        Iterator<String> iterator2 = words.iterator();
        while(iterator2.hasNext()){
            String word = iterator2.next();
            System.out.println(word);
        }

        Iterator<String> iterator3 = words.iterator();
        while(iterator3.hasNext()){
            String word = iterator3.next();
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList(
                "Программированию обычно учат на примерах.".split(" ")
        ));
        print(words);
    }
}
