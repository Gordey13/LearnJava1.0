package task.task11.task1106;

/*
Двигатель — сердце автомобиля
*/

public class Car {

    Engine engine = new Engine();

    public class Engine{
        private boolean isRunning = false;

        public void start(){
            this.isRunning = true;
            System.out.println("Двигатель запущен");
        }

        public void stop(){
            this.isRunning = false;
            System.out.println("Двигатель остановлен");
        }


    }
}
