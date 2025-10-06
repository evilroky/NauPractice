package src.main.java;

import java.util.Arrays;

public class StartingConfg {
    public static void main(String[] args) {
        try{
            System.out.println("Задание 1");
            Prac1 prac1 = new Prac1();
            prac1.start();
            System.out.println("\nЗадание 2");
            Prac2 prac2 = new Prac2();
            prac2.start();
            System.out.println("\nЗадание 3");
            Prac3 prac3 = new Prac3();
            prac3.start();
            System.out.println("\nЗадание 4");
            Prac4 prac4 = new Prac4();
            prac4.start();
            System.out.println("\nЗадание 5");
            Prac5 prac5 = new Prac5();
            prac5.starts();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
