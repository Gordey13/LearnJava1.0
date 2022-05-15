package task.task10.task1025;

import java.util.Calendar;

/*
Текущий год
*/

public class Solution {
    private int value = 100;
    private int currentYear;
    private static int count = 0;
    private static int sum = 0;
    private int age;
    private String name;
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Solution() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getClass());
        System.out.println(solution.currentYear);
        System.out.println(solution.getCurrentYear());
    }
}