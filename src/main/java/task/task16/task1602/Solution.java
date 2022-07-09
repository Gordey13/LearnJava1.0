package task.task16.task1602;
/*
Пропускаем сквозь себя

Сделай так, чтобы программа компилировалась, не используя try-catch.

Требования:
•	В методе main не должно быть блока try-catch.
•	Метод main должен бросать исключение.
•	Метод main должен вызывать метод generateLuckyNumber().
•	Метод generateLuckyNumber изменять нельзя.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        if(generateLuckyNumber() != 13) {
            System.out.println("Твое счастливое число: " + generateLuckyNumber());
        } else {
            throw new Exception("Не повезло");
        }
    }

    private static int generateLuckyNumber() {
        int luckyNumber = (int) (Math.random() * 13);
        return luckyNumber;
    }
}
