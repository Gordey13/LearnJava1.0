package task.task14.task1412;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

//        while (true) {/*тело*/ continue;} //continue=пропуск 1 хода
//        do{/*тело*/ break;} while(true); //break=СТОП
//        for (int i = 0; i < 10; i++) {/*тело*/}
//        for(Type var : vars){/*Тело*/}
        List<String> numbers = new ArrayList<>(12);
        String[] list = new String[]{"123"};
        Arrays.sort(list);
        Exception e;
        Object lists = "123";
        for (int i = 0; i < list.length; i++) {
            if (i > 3) {
                System.out.println("i больше 3");
                if (i == 1) {
                    System.out.println("i равно 1");
                } else if (i == 2) {
                    System.out.println("i равно 2");
                } else if (i == 3) {
                    System.out.println("i равно 3");
                } else {
                    System.out.println("i не в диапозоне");
                    break;
                }
            } else {
                System.out.println("i меньше 3");
                continue;
            }
        }
        do {
            System.out.println("Вывод ");
        } while (true);

        for(String number : numbers){
            System.out.println(number);
        }
        boolean temp; // по умоплчанию default false

    }
}
