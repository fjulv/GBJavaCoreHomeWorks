package Homework2;

/*
Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента и индекса элемента
 */
public class Task4 {

    public static int searchMax(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) max = i;
        }
        return max;
    }

    public static int searchMin(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) min = i;
        }
        return min;
    }

    public static int searchIndexMax(int[] array) {
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxIndex]) maxIndex = i;
        }
        return maxIndex;
    }

    public static int searchIndexMin(int[] array) {
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minIndex]) minIndex = i;
        }
        return minIndex;
    }
}
