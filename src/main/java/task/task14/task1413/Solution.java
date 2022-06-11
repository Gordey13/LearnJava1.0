package task.task14.task1413;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static HashMap<String, Double> grandes = new HashMap<>();

    public static void main(String[] args) {
//        add;
    }

    public static void printStudentInfo() {
        for (Map.Entry<String, Double> pair : grandes.entrySet()) {
            String key = pair.getKey();
            Double value = pair.getValue();
            System.out.println(key + " : " + value);
        }
    }

    public static void addStudents() {
        grandes.put("Андрей Аверин", 4.3D);
        grandes.put("Владимир Махачкала", 5.0D);
        grandes.put("Александр Рудольфович", 3.4D);
        grandes.put("Нарэк Шурупян", 2.5D);
        grandes.put("Станислав Зайцев", 4.3D);
    }
}
