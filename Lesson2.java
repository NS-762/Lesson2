import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {

    public static void main (String args[]) {
        invert(); //задание 1
        stepThree(); //задание 2
        changesArr(); //задание 3
        squareArr(); //задание 4
        elementsMaxMin(); //задание 5
        int[] arr = {1, 2, 3, 0}; //задание 6
        System.out.println("Задание 6: " + proverkaArr(arr));
        int[] arr_2 = {1, 2, 4, 3, 0}; //задание 7
        Scanner scan = new Scanner(System.in);
        System.out.print("Задание 7: \nвведите шаг сдвига: ");
        int n = scan.nextInt();
        shiftArr(arr_2, n);
    }

    static void invert() { //задание 1
        int [] arr = {1, 0, 0, 1, 0, 1, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            }  else {
                arr[i] = 1;
            }
        }
        System.out.println("Задание 1: " + Arrays.toString(arr));
    }

    static void stepThree() { //задание 2
        int[] arr = new int[8];
        for (int i = 0, num = 0; num < 8; i += 3, num++) {
            arr[num] = i;
        }
        System.out.println("Задание 2: " + Arrays.toString(arr));
    }

    static void changesArr() { //задание 3
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("Задание 3: " + Arrays.toString(arr));
    }

    static void squareArr() { //задание 4
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }
        System.out.println("Задание 4:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    static void elementsMaxMin() { //Задание 5
        int [] arr = {4, 19, 3, 10, 12, 1, 8};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Задание 5:\nминиамальный элемент: " + min + "\nмаксимальный элемент: " + max);
    }

    static boolean proverkaArr(int[] arr) { //задание 6
        int right_part = 0;
        int left_part = 0;
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            right_part += arr[i];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            left_part += arr[i];
            right_part -= arr[i];
            if (left_part == right_part) {
                result = true;
                break;
            }
        }
        return result;
    }

    static void shiftArr(int[] arr, int n) {
        while (n < 0) {
            n += arr.length;
        }
        int k = n % arr.length;
        int t = arr[0];
        int t_2;
        for (int i = 0; i < arr.length; i++) {
            t_2 = arr[k];
            arr[k] = t;
            t = t_2;
            k = (k + n) % arr.length;
        }
        System.out.println(Arrays.toString(arr));
    }
}