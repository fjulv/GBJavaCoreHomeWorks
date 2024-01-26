package lesson2;

/*
Написать метод, в который передается не пустой одномерный целочисленный массив,
метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
checkBalance([2, 1, 1, 2, 1]) → false,
checkBalance([10, || 1, 2, 3, 4]) → true.
Абстрактная граница показана символами ||, эти символы в массив не входят.
 */
public class Task2 {

    public static boolean checkBalance(int[] array) {
        int sumLeft = array[0];
        int sumRight = 0;
        for (int j : array) {
            sumRight += j;
        }
        for (int j : array) {
            if (sumLeft == sumRight) return true;
            sumLeft += j;
            sumRight -= j;
        }
        return sumLeft == sumRight;
    }
}
