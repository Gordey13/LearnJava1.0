package task.task15.task1517;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/*
Получение потока Stream
Требования:
•	После ввода с клавиатуры "ок" программа должна завершаться исключением SecurityException.
•	В блоке catch в консоли должна выводиться переменная answer, чтобы после ввода с клавиатуры "ок" все ранее введенные строки вывелись в консоли в обратном порядке.
•	В блоке catch должно выбрасываться пойманное исключение, а не создаваться новое.
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\Гордей\\Desktop\\Карты\\123.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println(bufferedReader.readLine());
        
//      Только когда мы вызовем метод buff.readLine(), произойдет следующее:
//      Объект BufferedReader вызовет метод read() у объекта InputStreamReader
//      Объект InputStreamReader вызовет метод read() у объекта FileInputStream
//      Объект FileInputStream начнет читать данные из файла
    }
}


