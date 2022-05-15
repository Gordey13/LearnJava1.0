package task.task10.task1022;

/*
Презентация роботов
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println("Презентация роботов произведенных компанией " + Robot.vendor);

        Robot robot0 = new Robot("RCV-123", 2051);
        robot0.displayInformation();

        Robot robot1 = new Robot("Mechno-Dog", 2012);
        robot1.displayInformation();

        Robot robot2 = new Robot("Eva-robotics", 2090);
        robot2.displayInformation();

    }
}



