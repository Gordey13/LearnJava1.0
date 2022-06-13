package task.lambda;

public class Student {
    String name;
    Character sex;
    Integer age;
    Integer course;
    Double avgGrade;

    public Student(String name, Character sex, Integer age, Integer course, Double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public Character getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getCourse() {
        return course;
    }

    public Double getAvgGrade() {
        return avgGrade;
    }
}
