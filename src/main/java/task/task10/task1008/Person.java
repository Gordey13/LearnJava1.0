package task.task10.task1008;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() { // getName()— метод возвращает значение поля name
        return name;
    }

    public void setName(String name) { // setName()— метод изменяет значение поля name
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //сравнение ссылок на объекты

        if (o == null || getClass() != o.getClass())
            return false;  //сравнение объекта с null и сравнение классов объектов

        Person person = (Person) o;     // операция приведения типа

        if (this.age != person.age)     //если возрасты не равны, сразу return false
            return false;

        if (this.name == null)          //Если this.name равно null, нет смысла сравнивать через equals.
            return person.name == null; //Тут либо второе поле name равно null, либо нет.

        return this.name.equals(person.name); //сравнение два поля name через equals
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}