package task.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Иван");
        list.add("Заур");
        list.add("Гордей");
        list.add("Андрей");
        System.out.println(list); //
        Collections.sort(list); // A-Z
        System.out.println(list);

        List<Solid> listSolids = new ArrayList<>();
        Solid solid = new Solid("Мария", 2200, 1);
        Solid solid1 = new Solid("Иван", 1000, 5);
        Solid solid2 = new Solid("Заур", 6999, 14);
        Solid solid3 = new Solid("Гордей", 3689, 2);
        Solid solid4 = new Solid("Андрей", 2200, 24);
        listSolids.add(solid);
        listSolids.add(solid1);
        listSolids.add(solid2);
        listSolids.add(solid3);
        listSolids.add(solid4);
        System.out.println(listSolids);
//        До сортировки
        Collections.sort(listSolids, new NameComparator());
//        После сортировки <solid>
        System.out.println(listSolids);
    }
}

class Solid {
    String name;
    Integer salary;
    Integer id;

    public Solid(String name, Integer salary, Integer id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Solid{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}

class IdComparator implements Comparator<Solid> {
    @Override
    public int compare(Solid res1, Solid res2) {
        if (res1.id == res2.id) {
            return 0;
        } else if (res1.id < res2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class NameComparator implements Comparator<Solid> {
    @Override
    public int compare(Solid res1, Solid res2) {
    return res1.name.compareTo(res2.name);
    }
}

class SalaryComparator implements Comparator<Solid> {
    @Override
    public int compare(Solid res1, Solid res2) {
        return res1.salary.compareTo(res2.salary);
    }
}