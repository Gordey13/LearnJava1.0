package task.task14.task1411;

import java.util.HashMap;

/*
Успеваемость студентов-2
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();
    public static HashMap<Integer, String> arrayList = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Список студентов группы: ");
        printStudents();
        System.out.print("Средний балл группы: " + getAverageMark());
    }

    public static void addStudents() {
        arrayList.put(1, "xaaxaxa");
        arrayList.put(2, "xexexe"); // добавить элемент в MAP
        arrayList.size();  //размер MAP
        arrayList.values(); // получить значение VALUE
        arrayList.containsKey(1);
        arrayList.put(1, "Значение, которое хочу добавить");
        String name = (arrayList.size() <= 10) ? "Майкл, кол-во MIN" : "Гравюра, кол-во МАХ";
        Integer sizeArray = (arrayList.size() == 10) ? 0 : 10;
        String sizeAbc = (arrayList.size() <10) ? "ABSS" : "ABCDER";


        grades.put("Давыдов Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        for (String name : grades.keySet()) {
            System.out.println(name);
        }
    }

    public static Double getAverageMark() {
        Double sum = 0.0;
        for (Double arg : grades.values()) {
            sum += arg;
        }
        return sum / grades.size();
    }
}

