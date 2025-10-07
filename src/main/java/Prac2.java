package src.main.java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Вариант 4. Практическое задание 2. Сортировка выбором.
//Реализован механизм сортировки выбором. Формируется массив из n элементов(задает пользователь), элементы могут принимать значения от -10 до 10.
public class Prac2 {

    private void selectionSort(double[] sortArr){
        for (int i =0; i < sortArr.length; i++){
            int pos = i;
            double min = sortArr[i];
            for (int j = i+1; j < sortArr.length; j++){
                if (sortArr[j] < min){
                    pos = j;
                    min = sortArr[j];
                }
            }
            sortArr[pos] = sortArr[i];
            sortArr[i] = min;
        }
    }

    public void startSelectionSort() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Размер массива");
        int n = scan.nextInt();
        double[] sortArr = new double[n];
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            double x = rand.nextDouble(20) - 10;
            sortArr[i] = Math.round(x * 100.0) / 100.0;
        }
        System.out.println("Изначальный массив: " + Arrays.toString(sortArr));
        selectionSort(sortArr);
        System.out.println("Отсортированный массив: " + Arrays.toString(sortArr));
    }
}
