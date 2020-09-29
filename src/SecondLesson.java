package Lesson2;

import java.util.Arrays;        //Необходим для вывода массива, сгенерированного в 1ом задании

public class SecondLesson {
    public static void main(String[] args) {

        System.out.println("1.");
        firstEx();
        System.out.println("\n2.");
        secondEx();
        System.out.println("\n3.");
        thirdEx();
        System.out.println("\n4.");
        fourthEx();
    }


    static void firstEx() {
        int[] randomarray1 = new int[7];  //Генерируем массив длинной 7 чисел
        for (int i = 0; i < randomarray1.length; i++) {
            randomarray1[i] = (int) Math.round(Math.random() * 1);
        }
        System.out.println("Генерируем массив \nПолучен следующий массив" + Arrays.toString(randomarray1)); //Выводим получившийся массив
        int[] array1 = randomarray1;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array1[i] == 1 ? 0 : 1;
            System.out.print(array1[i] + " ");
        }
    }

    static void secondEx() {
        int[] array2 = new int[8];
        for (int i = 1, j = 0; i < array2.length; i++) array2[i] = j += 3;
        for (int x : array2) System.out.print(x + " ");
    }
    static void thirdEx() {
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) array3[i] *= 2;
            System.out.print(array3[i] + " ");
        }
    }
    static void fourthEx() {

        int[][] array4 = new int[7][7];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0, j2 = array4[i].length; j < array4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) array4[i][j] = 1;
                System.out.print(array4[i][j] + " ");
            }
            System.out.print("\r\n");
        }
    }


}
