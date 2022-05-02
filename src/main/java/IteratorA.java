package learn.java;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorA {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>(10);
        arrayList.add("asdf");

        Iterator<String> iterator = arrayList.iterator(); // Создание объекта Iterator
        while(iterator.hasNext()){                          //Есть следующий элемент? Если есть -> True
            iterator.next();                               //Получить элемент из массива ArrayList
            iterator.remove();
            System.out.println(iterator.next());
        }
        Iterator<String> iterator2 = arrayList.iterator();
        while(iterator2.hasNext()){
            iterator2.next();
            iterator2.remove();
        }


    }
}
