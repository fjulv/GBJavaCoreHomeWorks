package lesson2;

import lesson2.Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Task1.fillArr(array);
        Task1.fillArr2(array);

        int [] array2 = {2, 1, 1, 2, 1};
        System.out.println(Task2.checkBalance(array2));
    }
}
