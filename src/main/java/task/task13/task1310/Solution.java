package task.task13.task1310;

import java.util.Objects;

//    Ключевые слова в JAVA
//    Примитивные типы: byte short int long float double char boolean //
//    Value default: 0 0.0 null false /u0000
//    Классы: Integer Char Double Float Long Boolean Short Byte
//    boxing/unboxing int a = (int) c; intValue();
//    Лог. операторы: >= <= == > < != || | & && !
//    ++i i++ i-- --i i+=1 ""+"" / * - + %

//    Условия, циклы: for while do-while forEach break continue
//    Оператор выбора: switch case default
//    Тернарный оператор ?: if else

//    Модификаторы доступа: public protected private
//    Импорт / объявление: import class interface implements void package abstract extends static final
//    Возврат / создание / вызов: return super this new

//    Исключения: try catch finally throw throws
//    Доп. слова без группы: enum instanceof
//    Потоки: volatility, synchronize

//    Конструкции: getter setter constructor equals toString hasCode
//    Классы: Object String
//    Массивы Array 1D 2D
//    Иерархия коллекции: List Set Map
//    Map: HashMap
//    Set: HashSet
//    List: ArrayList
//
//


public class Solution {

    private String abc;
    private String bdc;

    public Solution(String abc) {
        this.abc = abc;
    }

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }


    @Override
    public String toString() {
        return "MyClas{" +
                "abc='" + abc + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solution myClas = (Solution) o;
        return Objects.equals(abc, myClas.abc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abc);
    }

    public void cycle() {
        for (int i = 0; i < 10; i++) {
        }
    }
    public void dowhilecycle(){
//        while() do {} break; continue;
    }

    public void setAb(String abc){
        this.abc = abc;
    }

    public String getAb(){
        return this.abc;
    }

    public void MyClass(String abs, String bdc){
        this.abc = abs;
        this.bdc = bdc;
    }

    private boolean primetiv() {
        char f = 2;
        byte c1 = (byte) 1;
        short c = (short) 2;
        int a = (int) 4;
        long b = (long) 8;
        float v = (float) 4;
        double n = (double) 8;
        boolean u123 = true;
        return u123;
//        return this super void
    }

    protected void qewrt(){

    }
}


//        String abc = "ASDC"; // imutable
//        String tri = abc.toUpperCase();
//        System.out.println("123");
//
//        for (int i = 0; i < 10; i++) {
//            if(i<=5){
//                System.out.println("i<5");
//                continue;
//            } else if (i == 0) {
//
//            }
//            else {
//                System.out.println("i>5");
//                break;
//            }
//
////            do{} while{};
//
////            switch (123>123)
////            case 1:
////                System.out.println("123");
////            case 2:
////                System.out.println("321");
////            default;
//
//                do while
//                while do
//                for()
//                if else
//                if if if else else
//                break;
//                continue;
//
//                public
//                private // инкапсуляция
//                protected
//
//
//                return boolean;
//                        void
//                                super
//                                        this
//        }
//    }









