package task.task14.task1402;

import java.util.HashSet;
import static java.util.Arrays.asList;

/*
Проверка присутствия
*/

public class Solution {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.println(String.format("Слово %s есть в множестве", word));
        } else {
            System.out.println(String.format("Слова %s нет в множестве", word));
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
