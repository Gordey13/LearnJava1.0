package task.generics;

import task.task10.task1023.Car;

import java.util.ArrayList;
import java.util.List;

public class ParameterizedClass {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // Сырой тип, так не писать
        list.add(new StringBuilder());
        list.add(5);
        list.add("123");
        list.add(new Car());

//        Type Safe & Reusable code
        List<String> list1 = new ArrayList<>(); // <> - diamond
        list1.add("");
        list1.add(String.valueOf(123));

        Info<String> info1 = new Info<>("Привет");
        System.out.println(Info.class);
        Info<Integer> info2 = new Info<>(123);
        System.out.println(info2);
        String s = info1.getValue();
        System.out.println(s);
    }
}

class Info <T> { // T = type placeholder
    private T value;
    public Info(T value) {
        this.value=value;
    }
    public String toString(){
        return "[{" + value + "}]";
    }
    public T getValue(){
        return this.value;
    }
}

class Pair<K, T> {
    private K key;
    private T value;

    public Pair(T value, K key) {
        this.value = value;
        this.key = key;
    }

    public <T> T getValue() {
        return (T) value;
    }

    public K getKey() {
        return key;
    }
}
