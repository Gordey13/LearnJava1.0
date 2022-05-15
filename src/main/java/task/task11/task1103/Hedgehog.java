package task.task11.task1103;

/*
Ежик и яблоко
*/

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    private void eat(Lemon lemon) {
        System.out.println("Лимон был съеден");
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Lemon lemon = new Lemon();
        Hedgehog hedgehog = new Hedgehog();
        hedgehog.eat(lemon);
        hedgehog.eat(apple);
    }

    public static class Apple {
    }

    public static class Lemon{

    }
}