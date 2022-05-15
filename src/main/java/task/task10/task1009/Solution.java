package task.task10.task1009;

/*
Кубический калькулятор в кубе
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static long cube(long a){
        return a*a*a;
    }

    public static long ninthDegree(long a){
        return cube(cube(a));
    }
}
