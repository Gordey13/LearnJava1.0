package task.task11.task1104;

/*
Прогноз погоды
*/

public class Solution {

    public static void showWeather(City city) {
        System.out.println("В городе " + city.getName() + " сегодня температура воздуха " + city.getTemperature());
        System.out.println(String.format("В городе %s сегодня температура воздуха %d", city.getName(), 16));
        System.out.println(String.format("В городе %s сегодня температура воздуха %d", city.getName(), city.getTemperature()));
    }

    public static void main(String[] args) {
        City city = new City("Воронеж", 13);
        Solution.showWeather(city);
    }
}
