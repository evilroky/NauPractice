package src.main.java;

import java.util.Arrays;
import java.util.Random;

//Вариант 4. Практическое задание 1. Найти последний положительный элемент в массиве.
//Формируется массив из 20 элементов, элементы могут принимать значения от -25 до 25.
public class Prac1 {
    public void start() {
        int[] nums = new int[20];

        Random rand = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(51) -25;
        }
        int answer = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                answer = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(answer);
    }
}
