package com.company.HomeWork.Homework_1_5_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите название задачи и время на ее выполнение:");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //Находим начальное время
        int startPos = input.indexOf("начинается в");
        String startTimeString = input.substring(startPos + 12, startPos + 15);
        startTimeString = startTimeString.trim();
        int startTime = Integer.parseInt(startTimeString);

        // Находим конечное время
        int endPos = input.indexOf("заканчивается в");
        String endTimeString = input.substring(endPos + 15, endPos + 18);
        endTimeString = endTimeString.trim();
        int endTime = Integer.parseInt(endTimeString);

        // Вычисляем сколько времени займет задача
        int diff = endTime - startTime;
        if (diff < 0) {
            System.out.println("Неправильно задано время начала и окончания задачи");
        } else {
            System.out.println("На задачу потребуется " + diff + " часа");
        }
    }
}