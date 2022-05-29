package task.task14.task1410;

import java.util.HashMap;

/*
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudent("Andrey", 4.0);
        addStudent("Andrey", 5.0);
        addStudent("Andrey", 3.8);
        addStudent("Andrey", 4.3);
        addStudent("Andrey", 4.7);
        System.out.println(grades);
    }

    public static void addStudent(String fio, Double numbers) {
        grades.put(fio, numbers);
    }
}

