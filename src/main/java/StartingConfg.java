package src.main.java;

public class StartingConfg {
    public static void main(String[] args) {
        try{
            System.out.println("Задание 1");
            Prac1 prac1 = new Prac1();
            prac1.startWorkWithMassive();
            System.out.println("\nЗадание 2");
            Prac2 prac2 = new Prac2();
            prac2.startSelectionSort();
            System.out.println("\nЗадание 3");
            Prac3 prac3 = new Prac3();
            prac3.startStreamApi();
            System.out.println("\nЗадание 4");
            Prac4 prac4 = new Prac4();
            prac4.startHttpClientAndJson();
            System.out.println("\nЗадание 5");
            Prac5 prac5 = new Prac5();
            prac5.startRealizationInterfaceTask();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
