package task.task16.task1601;

public class Solution {
    public static String errorMessage = "Щепка Ашибка аще чесла. Дэээ!";
    public static void main(String[] args) {
        try {
            Solution.generateLuckyNumber();
        } catch (Exception e) {
            System.out.println(errorMessage);
        }
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if(luckyNumber == 13) {
            throw new Exception();
        }
        System.out.println("Твое счастливое число: " + luckyNumber);
    }
}
