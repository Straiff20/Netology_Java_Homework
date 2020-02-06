package com.company.HomeWork.Homework_1_4_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Сравнение над double/float");
        System.out.println("1. Сравнить");
        System.out.println("2. Округлить");
        System.out.println("3. Отбросить дробную часть");

        choice = scanner.nextInt();
        System.out.println("Введите первое число:");
        float number_1 = scanner.nextFloat();

        System.out.println("Введите второе число:");
        float number_2 = scanner.nextFloat();

        switch (choice) {
            case (1): {
                String result = compare(number_1, number_2);
                System.out.println(result);
                break;
            }
            case (2): {
                round(number_1, number_2);
                break;
            }
            case (3): {
                leave(number_1, number_2);
                break;
            }
        }
    }

    static String compare(float number_1, float number_2) {
        float diff = number_1 - number_2;
        if (diff == 0) {
            return "Числа равны";
        } else if (diff < 0) {
            return "Первое число меньше второго";
        } else {
            return "Второе число меньше первого";
        }
    }

    static void round(float number_1, float number_2) {
        System.out.println("Первое число: " + Math.round(number_1));
        System.out.println("Второе число: " + Math.round(number_2));
    }

    static void leave(float number_1, float number_2) {
        System.out.println("Первое число: " + (long) (number_1));
        System.out.println("Второе число: " + (long) (number_2));
    }
}
