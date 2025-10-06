import java.util.Arrays;
import java.util.Random;

//Вариант 4. Практическое задание 2. Сортировка выбором.
//Реализован механизм сортировки выбором. Формируется массив из 10 элементов, элементы могут принимать значения от -10 до 10.
public class Prac2 {

    public static void selectionSort(double[] sortArr){
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

    public static void main(String[] args) {
        double[] sortArr = new double[10];
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
