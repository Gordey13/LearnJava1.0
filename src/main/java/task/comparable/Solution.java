package task.comparable;

import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(listSolids);
//        После сортировки comparable<solid>
        System.out.println(listSolids);
    }
}

class Solid implements Comparable<Solid> {
    private String name;
    private Integer salary;
    private Integer id;

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

    @Override
    public int compareTo(Solid anotherSolid) {
//        if (this.id == anotherSolid.id) {
//            return 0;
//        } else if (this.id < anotherSolid.id) {
//            return -1;
//        } else {
//            return 1;
//        }

//        return this.id- anotherSolid.id;

//        return this.id.compareTo(anotherSolid.id);

        int res = this.name.compareTo(anotherSolid.name);
        if (res == 0) {
            res = this.salary.compareTo(anotherSolid.salary);
        }
        return res;
    }
}
