package task.task10.task1004;

/*
Построим новый бизнес-комплекс JavaRush Business Center
*/

public class Cat {
    public static final int UNKNOWN = -1;
    private int age;
    private String name;

    public Cat() {
        this.age = UNKNOWN;
        this.name = "Безыменный";
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat2 = new Cat(50, "Васька");
        Cat cat1 = new Cat(12, "Барсик");
    }
}
