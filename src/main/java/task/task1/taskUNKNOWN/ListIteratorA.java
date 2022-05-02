//package task.task1.task101;
//
//import java.util.*;
//
//public class ListIteratorA {
//    public static void main(String[] args) {
//        String s = "Madam";
//        List<Character> list = new LinkedList<>();
//
//        ArrayList<String> arrayList = new ArrayList<>(10);
//        ArrayList<String> arrayList1 = new ArrayList<>(10);
//        ArrayList<String> arrayList2 = new ArrayList<String>();
//        List<String> arrayList3 = new ArrayList<>();
//        arrayList.add("1");
//        arrayList.get(0);
//        arrayList.remove(0);
//        arrayList.add(1, "2");
//        arrayList1.addAll(arrayList);
//        arrayList.clear();
//        for (int i = 0; i <arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
//        arrayList.set(0, "0");
//        arrayList.contains(s); //Содержит ли массив похожие элементы?
//        arrayList.isEmpty(); //Пустой массив?
//        int index = arrayList.indexOf("2");
//        int indexLast = arrayList.lastIndexOf(0);
//        arrayList.toString(); // Сформировать из массива строку
//
//        Iterator<String> iterator = arrayList.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//            iterator.remove();
//        }
//    }
//    public void methodHasA(){
//        LinkedList<IterStude> linkedList = new LinkedList<>();
//        IterStude iterStude = new IterStude("Anna", 18, 3, "Drob");
//        linkedList.add(new IterStude("Anna", 18, 3, "Drob"));
//        iterStude.getAge();
//        iterStude.getCourse();
//        iterStude.getFamily();
//        iterStude.setName("Gordey");
//
//
//    }
//
//
//
//    public class IterStude{
//        private String name;
//        private int age;
//        private int course;
//        private String family;
//
//        public IterStude(String name, int age, int course, String family) {
//            this.name = name;
//            this.age = age;
//            this.course = course;
//            this.family = family;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public void setAge(int age) {
//            this.age = age;
//        }
//
//        public int getCourse() {
//            return course;
//        }
//
//        public void setCourse(int course) {
//            this.course = course;
//        }
//
//        public String getFamily() {
//            return family;
//        }
//
//        public void setFamily(String family) {
//            this.family = family;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            IterStude iterStude = (IterStude) o;
//            return age == iterStude.age && course == iterStude.course && Objects.equals(name, iterStude.name) && Objects.equals(family, iterStude.family);
//        }
//
//        @Override
//        public String toString() {
//            return "IterStude{" +
//                    "name='" + name + '\'' +
//                    ", age=" + age +
//                    ", course=" + course +
//                    ", family='" + family + '\'' +
//                    '}';
//        }
//
//
//    }
//}
