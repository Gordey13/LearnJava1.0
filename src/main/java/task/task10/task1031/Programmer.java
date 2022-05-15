package task.task10.task1031;

/*
Установка условия перед присвоением нового значения переменой объекта
*/

public class Programmer {
    private int salary = 1000;

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        if(this.salary < salary)
            this.salary = salary;
    }
}



