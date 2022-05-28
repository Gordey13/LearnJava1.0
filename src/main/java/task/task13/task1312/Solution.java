package task.task13.task1312;

public class Solution {
    public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for (int i = 0; i < 50; i++) {
            arrayList.add("count: " + i);
        }
        arrayList.print();
    }
}
