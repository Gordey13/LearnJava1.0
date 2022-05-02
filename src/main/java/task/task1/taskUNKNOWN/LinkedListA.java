//package task.task1.task101;
//
//import java.util.LinkedList;
//
//public class LinkedListA {
//    public static class Student{
//        private int age;
//        private String name;
//
//        public Student(int age, String name) {
//            this.age = age;
//            this.name = name;
//        }
//
//        @Override
//        public String toString() {
//            return "Student{" +
//                    "age=" + age +
//                    ", name='" + name + '\'' +
//                    '}';
//        }
//    }
//
//    public static void main(String[] args) {
//        Student st1 = new Student(18, "Anna");
//        Student st2 = new Student(19, "Petr");
//        Student st3 = new Student(20, "Dmitry");
//        // Элементы LinkedList - это звенья одной цепочки. МАССИВ в виде цепи! Эти элементы хранят ссылки (DOUBLY LIST) на предыдущий и следующий элемент. А SINGLY LIST на последующий элемент.
//        LinkedList<Student> linkedList = new LinkedList<>(); // Создать объект ссылочного массива
//        linkedList.add(st2);                  // Метод добавлени в конец массива
//        linkedList.remove(st2);               // Добавление элемента и удаление элемента изменяются ссылки на следующий и предыдущий элемент
//        linkedList.add(1, st2);         // Метод добавления по номеру Индекса
//        System.out.println(linkedList);
//        System.out.println(linkedList.get(2));
////        90% СЛУЧАЕВ используем ArrayList
//        // Для поиска элементов использовать лучше массив ArrayList
//        // Для хранения и удаления лучше использовать массив LinkedList.
//        // Для поиска должны пройти по всей цепочке элементов до искомого элемента.
//        // LinkedList как правило следует использовать когда:
//        // 1. Невелико кол-во операций получения элементов
//        // 2. Велико кол-во операций добавления и удаления элементов.
//        // Особенно если речь идет о элементах в начале коллекции.
//    }
//
//
//
//
//
//
//}
