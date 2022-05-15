package task.task10.task1017;

import java.util.Arrays;

/*
Дефрагментацию, то есть перемещает все объекты в начало массива в таком же порядке,
передвинув все "дыры" (элементы равные null) в конец массива.
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        System.out.println(Arrays.toString(memory));
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        int length = array.length;
        String[] temp = new String[length];
        int j = 0;
        for (int i = 0; i < length; i++) {
            if(array[i] != null) {
                temp[j] = array[i];
                j++;
                }
            }
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }
    }
}


