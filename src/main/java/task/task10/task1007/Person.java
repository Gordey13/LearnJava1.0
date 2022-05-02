package task.task10.task1007;

public class Person {
    private String name;

    public Person(String name) { // Инициализация поля через конструктор
        this.name = name;
    }

    public String getName() { // getName()— метод возвращает значение поля name
        return name;
    }

    public void setName(String name) { // setName()— метод изменяет значение поля name
        this.name = name;
    }
}