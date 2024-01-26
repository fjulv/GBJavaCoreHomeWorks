package Homework2;

/*
Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
 */
public class Task2 {

    public static int findDifference(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i : array) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        return max - min;
    }
}

