package task.task15.task1504;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>(){{
            add("Привет");
            add("Hello");
            add("Hola");
            add("Bonjour");
            add("Cialo");
            add("Namaste");
        }};

        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        if(set.contains(s)){
            System.out.println("Да, есть слово в куче объектов");

        ArrayList<String> list = new ArrayList<String>(){{
            add("Привет");
            add("Hello");
            add("Hola");
            add("Bonjour");
            add("Cialo");
            add("Namaste");
        }};
        Collections.sort(list);     // сортирует список
        Collections.shuffle(list); // перемешивает список
        Collections.addAll(list, "Хелло", "}{ell0 w0rld");
                                    // добавляет элементы в список
        Collections.reverse(list);  // разворачивает список задом наперед
        Collections.replaceAll(list, "Привет", "ПриветПривет");
        ArrayList<String> listMe = new ArrayList<String>();
        Collections.copy(listMe, list);
        for(String str : listMe){
            System.out.println(str);
        }
        }
    }
}
