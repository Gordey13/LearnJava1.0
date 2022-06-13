package task.lambda;

import java.util.ArrayList;

public class Solution {


    public static void main(String[] args) {
        Student st1 = new Student("Иван", 'M', 22, 3, 4.2);
        Student st2 = new Student("Андрей", 'M', 23, 4, 4.9);
        Student st3 = new Student("Петр", 'M', 24, 2, 5.2);
        Student st4 = new Student("Мария", 'F', 18, 1, 6.2);
        Student st5 = new Student("Антон", 'M', 20, 3, 8.2);
        Student st6 = new Student("Радон", 'M', 19, 5, 10.0);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);

        Solution student = new Solution();
    }

    void printOverGrade(ArrayList<Student> al, double grade){
        for (Student s : al) {
            if(s.avgGrade>grade){
                System.out.println(s);
            }
        }
    }
    void printOverAge(ArrayList<Student> al, Integer age){
        for (Student s : al) {
            if(s.age<age){
                System.out.println(s);
            }
        }
    }
    void printOverMixCondition(ArrayList<Student> al, double grade, Integer age, Character sex) {
        for (Student s : al) {
            if(s.age>age && s.avgGrade<grade && s.sex==sex){
                System.out.println(s);
            }
        }
    }

}

interface StudentChecks{
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks{
    @Override
    public boolean check(Student s) {
        return s.avgGrade>8;
    }
}
