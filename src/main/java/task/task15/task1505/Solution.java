package task.task15.task1505;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 11, 2, 23, 5, 15, 4, 2, 4);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Collections.addAll(list, 11, 234, 4534, 587, 43, 234);
                                // добавить элементы в коллекцию

        Collections.sort(list);

        int index = Collections.binarySearch(list, 5);
        // бинарный поиск
        int index2 = Collections.binarySearch(list, 15);
        int index3 = Collections.binarySearch(list, 16);

        boolean isDifferent = Collections.disjoint(list, list2);
        System.out.println(isDifferent); // есть ли у коллекции одинаковые элементы?

        int count = Collections.frequency(list, 4); System.out.println(count);
        // сколько раз в коллекции встречался элемент

        int max = Collections.max(list); System.out.println(max);
        int min = Collections.min(list); System.out.println(min);

        Collections.shuffle(list);
        for(int i : list){
            System.out.println(i);
        } // перемешиывает все элементы списка

        Collections.rotate(list, 3); // сдвинуть на 3 позиции
        Collections.sort(list); // Сортировать коллекцию
        Collections.reverse(list); // меняет порядок элементов на обратный
        Collections.copy(list, list2); // Копирует список
        Collections.replaceAll(list, 2, 20); // замена всех элементов
        Collections.fill(list, 11); // замена на 11 всех элементов

    }
}
