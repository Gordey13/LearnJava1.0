package task.task13.task1321;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>(){{
            add(new Student("Андрей"));
            add(new Student("Василий"));
            add(new Student("Игорь"));
        }};

        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList<Student> students){
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }
}
