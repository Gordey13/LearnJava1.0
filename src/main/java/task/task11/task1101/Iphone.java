package task.task11.task1101;

import java.util.Objects;

/*
Переопределить метод equals для сравнения параметров полей объектов.
1. Проверка и сравнение ссылок на объект
2. Проверка, что объект не null и проверка класса объекта
3. Проведение типа и сравнение полей. Методом equals
*/

public class Iphone {
    private String model;
    private String color;
    private int price;
    private int gosNomer;

    public Iphone(String model, String color, int price, int gosNomer) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.gosNomer = gosNomer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Iphone iphone = (Iphone) o;
        if(price != iphone.price) return false;
        if(gosNomer != iphone.gosNomer) return false;
        return Objects.equals(model, iphone.model) &&
                Objects.equals(color, iphone.color);
    }

    @Override
    public int hashCode(){
        return Objects.hash(price, model, gosNomer, color);
    }

//    @Override
//    public int hashCode() {
//        int result = model == null ? 0 : model.hashCode();
//        result = 31 * result + manufactureYear;
//        result = 31 * result + dollarPrice;
//        return result;
//    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999, 123);
        Iphone iphone2 = new Iphone("X", "Black", 999, 123);

        System.out.println(iphone1.equals(iphone2));
    }

}