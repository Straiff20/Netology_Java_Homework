package com.company.HomeWork.HomeWork_2_1_3;

import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        TransportSchedule[] schedule = new TransportSchedule[10];
        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите через пробел номер автобуса, время прибытия в формате (hh:MM) и номер рейса");
            System.out.println("end для выхода из программы");
            String input = scanner.nextLine();
            if ("end".equals(input) || counter == 10) {
                System.out.println("Программа завершена.");
                break;
            }
            String[] info = input.split(" ");

            TransportSchedule item = new TransportSchedule(info[0], info[1], info[2]);
            schedule[counter] = item;
            counter += 1;

            Arrays.sort(schedule, 0, counter);

            System.out.println("Актуальное расписание:");
            for (int i = 0; i < counter; i++) {
                System.out.println(schedule[i]);
            }
        }
    }
}