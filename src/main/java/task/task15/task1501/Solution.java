package task.task15.task1501;

public class Solution {
    public static void main(String[] args) {
//      Преобразовать тип int к типу Integer
        Integer age = new Integer(18);
        Integer hundred = new Integer(100);
        Integer zero = new Integer(0);

//      Преобразовать тип Integer к типу int
        int x = age.intValue();
        if (x == 18) {
            System.out.println(x == 18);
        } else {
            System.out.println(x != 18);
        }
        int y = hundred.intValue();
        int z = zero.intValue();

        Integer a = 10;
        Integer a10 = Integer.valueOf(11);
        int b10 = a;
        int b = a.intValue();

        Integer a11 = 11;
        Integer a12 = Integer.valueOf(5);
        int cb = a11.intValue();
        Integer c = a + b;
        Integer c1 = Integer.valueOf(a.intValue() + a11);
        int d = a.intValue() + a11 + c1.intValue();

        int min = Integer.MIN_VALUE;
    }
}

class Integer1 {
    private int value;

    Integer1(int x) {
        this.value = x;
    }

    public int intValue() {
        return this.value;
    }

    public static Integer valueOf(int x) {
        return new Integer(x);
    }
}

class Boolean {
    public static final Boolean TRUE = new Boolean(true);
    public static final Boolean FALSE = new Boolean(false);

    private final boolean value;

    public Boolean(boolean value) {
        this.value = value;
    }

    public boolean booleanValue() {
        return value;
    }

    public static Boolean valueOf(boolean value) {
        return (value ? TRUE : FALSE);
    }
}
