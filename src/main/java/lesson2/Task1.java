package lesson2;

import java.util.Arrays;

/*
заполнить квадратный массив по диагоналям
 */
public class Task1 {
    public static void fillArr(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i == array[i].length - j - 1) {
                    array[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static void fillArr2(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - i - 1] = 1;
        }
        System.out.println(Arrays.deepToString(array));
    }
}


