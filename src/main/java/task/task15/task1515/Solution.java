package task.task15.task1515;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        buyElephant(null, scanner);
    }
    static void buyElephant(String answer, Scanner scanner) {
        if(answer == null) {
            System.out.println("Купить слона");
        } else if(answer.toLowerCase().equals("ок")) {
            System.out.println("");
            throw new SecurityException();
        } else {
            System.out.println("");
        }

        answer = scanner.nextLine();
        try {
            buyElephant(answer, scanner);
        } catch(Exception e) {
            System.out.println(answer);
            throw e;
        }
    }
}


