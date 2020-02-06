package com.company.HomeWork.Homework_1_3_1;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalTime = 0;    // для хранения общего времени на все задачи (изначально равно 0)
        int biggestTime = 0;  // для хранения времени самой продолжительной задачи (изначально равно 0). Для первой задачи ее время выполнения всегда будет больше, чем biggestTime
        int smallestTime = Integer.MAX_VALUE;  // для хранения времени самой короткой задачи, изначально равно максимальному значению integer(2147483647)

        while (true) {
            System.out.println("Введите название задачи:");
            String firma = scanner.nextLine();
            System.out.println("Сколько дней потребуется на выполнение?");
            int days = scanner.nextInt();
            System.out.println("Сколько часов потребуется на выполнение?");
            int hours = scanner.nextInt();
            System.out.println("Сколько минут потребуется на выполнение?");
            int minutes = scanner.nextInt();

            int currentTimeTask = convertToSeconds(days, hours, minutes);
            totalTime = totalTime + currentTimeTask;

            if (currentTimeTask > biggestTime) {
                biggestTime = currentTimeTask;
            }
            if (currentTimeTask < smallestTime) {
                smallestTime = currentTimeTask;
            }

            System.out.println("Для завершения работы программы введите 'end' для продолжения 'enter'");

            scanner.nextLine();
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
        }

        System.out.println("Всего потребуется: " + totalTime + " секунд");
        System.out.println("Самая большая задача: " + biggestTime + " секунд");
        System.out.println("Самая маленькая задача: " + smallestTime + " секунд");
    }

    public static int convertToSeconds(int days, int hours, int minutes) {
        int seconds = ((((days * 24) + hours) * 60) + minutes) * 60;
        return seconds;
    }
}