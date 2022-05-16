package task.task13.task1303;

/*
Плата по счетам
*/

public class Solution {
    public static Integer balance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String bill = "1234567890";

        System.out.println("Текущий баланс : " + balance);
        processPayment(bill);
        System.out.println("Текущий баланс : " + balance);
    }

    public static void processPayment(String bill) {
        Integer cost = Integer.parseInt(bill);
        Solution.balance = Solution.balance - cost;
    }
}