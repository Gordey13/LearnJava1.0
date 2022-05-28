package task.task14.task1405;

import java.util.Scanner;
import static java.lang.Math.*;

public class Solution {
    private static double pi = PI;
    private static Scanner concole = new Scanner(System.in);

    public static double radius() {
        System.out.println("Диаметр цилиндра: ");
        double n = concole.nextInt();
        return n/2;
    }

    public static double height() {
        System.out.println("Высота цилиндра: ");
        double m = concole.nextInt();
        return m;
    }

    public static double volume() {
        double r = radius();
        double h = height();
        double s = pi * r * r;
        double volume = s * h;
        return volume;
    }

    public static void main(String[] args) {
        System.out.println(volume());
    }
}

//import math
//
//PI = math.pi
//
//
//def radius():
//n = float(input('Диаметр цилиндра: '))
//return n / 2
//
//
//def height():
//m = float(input('Высота цилиндра: '))
//return m
//
//
//def volume():
//r = radius()
//h = height()
//s = PI * r ** 2
//v = s * h
//return v
//
//
//print(volume())
