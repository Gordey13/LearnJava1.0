package learn.java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UnixStyleWindowsStyle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); //Создание объекта Scanner
        String path = console.nextLine(); //Чтение строки с консоли
        // 1 решение
        char[] chars = path.toCharArray();  //Преобразование строки в массив символов
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '/') {
                chars[i] = '\\';
            }
        }
        String result = new String(chars); //Создаем новую строку на основе массива символов.
        System.out.println(result);
        // 2 решение
        String array[] = path.split("/"); //Преобразование строки в массив строк. В качестве разделителя используется символ /
        String results = String.join("\\", array); //Объединяем все строки из массива строк, в качестве разделителя используется символ \
        // 3 решение
        String res = path.replace("/", "\\"); //Просто заменяем один символ на второй (второй — экранирован)

        if (path.endsWith(".jpg") || path.endsWith(".jpeg")) {
            System.out.println("Файл JPEG!");
        } else if (path.endsWith(".htm") || path.endsWith("html")) {
            System.out.println("Файл HTML");
        } else if (path.endsWith(".doc") || path.endsWith(".docx")) {
            System.out.println("Файл DOC");
        } else {
            System.out.println("Неизвестный формат документа");
        }
        String pathUri = "https://domen.ru//about/reviews";
        int index = pathUri.indexOf("//");
        int index2 = pathUri.indexOf("/", index + 2);

        String first = pathUri.substring(0, index + 2);
        String last = pathUri.substring(index2);

        String result2 = first + "javarush.ru" + last;
        System.out.println(result2);


    }
    public static String[] getTokens(String query, String delimiter) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
//        ----
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] tokenss = new String[stringTokenizer.countTokens()];
        int i = 0;
        while(stringTokenizer.hasMoreTokens()){
            tokenss[i++] = stringTokenizer.nextToken();
        }
        return tokenss;
    }

    public void spliter(){
        String name = "Georgy";
        int age = 18;
        int a = 13;
        int b = 17;
        int c = 25;
        String str = "Good news everyone!";
        String[] strings = str.split(" ");
        System.out.println(Arrays.toString(strings));
        String.format("Age=%d, Name=%s", age, name);
        String.format("FullName = %s", name);
        String.format("FullAge = %d", age);
        String.format("Age:%d", age);
        String.format("TvoeIme - %s", name);
        String.format("a=%2$d, b=%2$d, c=%3$d", a, b, c);

        StringBuilder builderNull = new StringBuilder();
        String resultBuilderString = builderNull
                .append(123 + "новая строка добавлена успешно в пустой объект изменяемой строки")
                .toString();
        StringBuilder builderName = new StringBuilder("Gordey");
        String nameBuilderString = builderName
                .deleteCharAt(1)
                .toString();
        StringBuilder builderAge = new StringBuilder("123123123");
        String replace2Delete = builderAge.replace(0, 2, "321").toString();
        String str123x5 = "123123123123123x5";
        StringBuilder builderAgeReverse = new StringBuilder(replace2Delete);
        builderAgeReverse.reverse();
        String soutreverse = builderAge.toString();
    }

//    public class ChessBoard{
//        public static ChessBoard board = new ChessBoard();
//        public ChessItem[][] cells = new ChessItem[8][8];
//    }
//    public class Game{
//        public static void main(String[] args){
//            var board = ChessBoard.board;
//            board.cells[0][3] = new King(Color.WHITE);
//            board.cells[0][4] = new Queen(Color.WHITE);
//        }
//    }
    public class Test{
        private String develop = "JavaRush";
        private int tower = 52;

    public Test(String develop, int tower) {
        this.develop = develop;
        this.tower = tower;
    }

    public Test() {
        this.develop = this.develop;
        this.tower = this.tower;
    }

}



}
