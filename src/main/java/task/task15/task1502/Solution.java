package task.task15.task1502;

import java.util.ArrayList;

public class Solution {


    public static void main(String[] args) {
        ArrayList<Integer> name = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            name.add(Integer.valueOf(i));
        }

        for (int i = 0; i < name.size()-i-1; i++) {
            System.out.println(name.get(i));
        }
        name.remove(0);
        name.get(0);
        name.add(0, 10);
        System.out.println(name.set(0, 11));
        System.out.println(name.size());
        System.out.println(name.isEmpty());
        name.clear();
        System.out.println(name.isEmpty());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= 20; i++)
            if(i%2 == 0) list.add(i);

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%4==0) list.remove(i); i--;
        }
    }
}
