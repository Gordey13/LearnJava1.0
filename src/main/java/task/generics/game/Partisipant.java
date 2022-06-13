package task.generics.game;

public abstract class Partisipant {
    private String name;
    private Integer age;

    public Partisipant(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
