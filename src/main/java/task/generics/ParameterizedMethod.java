package task.generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(2);
        list.add(3);

        int a = getValueAl(123);
        Integer i = GetValue.getValue(123);
    }
    public static <T> T getValueAl(T al){
        return al;
    }
}

class GetValue {
    public static <T> T getValue(T value) {
        return value;
    }
}

