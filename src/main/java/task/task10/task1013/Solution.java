package task.task10.task1013;

/*
String pool метод intern сравнивает входит ли строка в StringPool,
если true возвращает ссылку на найденый объект
*/

public class Solution {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
        System.out.println(equal(first, second));
    }

    public static boolean equal(String first, String second) {
        return first.intern() == second.intern();
    }
}


