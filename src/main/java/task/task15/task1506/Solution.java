package task.task15.task1506;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>() {{
            put("Алексей", 22);
            put("Олег", 24);
            put("Александр", 22);
            put("Павел", 26);
            put("Андрей", 24);
            put("Антон", 27);
            put("Антон", null);
        }};
        Set<String> setKey = map.keySet();
        for (String keyS : setKey) {
            Integer val = map.get(keyS);
            System.out.println(keyS + " --> " + val);
        }

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " --> " + value);
        }
            // var можно использовать вместо Map.Entry<String, Integer>
        for(Map.Entry<String, Integer> pair : map.entrySet()){
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " --> " + value);
        }

        HashMap<String, Integer> amp = new HashMap<String, Integer>(){{
            put("Алексей", 22);
            put("Олег", 24);
            put("Александр", 22);
            put("Павел", 26);
            put("Андрей", 24);
            put("Антон", 27);
            put("Антон", null);
        }};
        Integer s2 = amp.get(0);
        map.put(s2+"!", 0);
        for(Integer item: map.values()){
            System.out.println(item);
        }

        Day monday = Day.MONDAY;
        System.out.println(monday);
        Day friday = Day.FRIDAY;
        System.out.println(friday);
        Day tuesday = Day.TUESDAY;
        System.out.println(tuesday);
        Day wensday = Day.WEDNESDAY;
        System.out.println(wensday);

        Day[] days = Day.values();
        for(Day day : days){
            System.out.println(day);
        }
        // Собрать в массив enum и вывести порядковый номер элемента
        Day[] array = Day.values();
        for(Day quest : array){
            System.out.println(quest.ordinal());
        }

    }
}

class Entry<KeyType, ValueType> {
    private KeyType key;
    private ValueType value;

    public KeyType getKey() {
        return this.key;
    }

    public ValueType getValue() {
        return this.value;
    }
}

enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    private static final Month[] VALUES = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

    public static List<Month> asList(){
        ArrayList<Month> listMonth = new ArrayList<Month>();
        Collections.addAll(listMonth, values());
        return listMonth;
    }

    public static Month[] getWinterMonths(){
        return new Month[] {DECEMBER, JANUARY, FEBRUARY};
    }

    public static Month[] getSpringMonths(){
        return new Month[] {MARCH, APRIL, MAY};
    }

    public static Month[] getSummerMonths(){
        return new Month[]{JUNE, JULY, AUGUST};
    }
    public static Month[] getAutumnMonths(){
        return new Month[]{SEPTEMBER, OCTOBER, NOVEMBER};
    }
}