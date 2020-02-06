package com.company.HomeWork.HomeWork_4_1_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int choose = 0;

        while (true) {
            System.out.println("Выберите действие: " + "\n" +
                    "1. Добавить задачу" + "\n" +
                    "2. Вывести список задач" + "\n" +
                    "3. Удалить задачу" + "\n" +
                    "0. Выход");

            choose = Integer.parseInt(scanner.nextLine());

            if (choose == 0) {
                System.out.println("Всего доброго!");
                break;
            }

            if (choose == 1) {
                System.out.println("Введите задачу: ");
                String input = scanner.nextLine();
                tasks.add(input);
            }

            if (choose == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("-----------------------------" + "\n" +
                            "Ни одной задачи не добавлено." + "\n" +
                            "-----------------------------");
                } else {
                    System.out.println("Задачи: ");
                    int i = 1;  //  переменная для индекса внетри листа
                    for (String task : tasks) {
                        System.out.println(i + ") " + task);
                        i++;
                    }
                }
            }


            if (choose == 3) {
                if (tasks.isEmpty()) {
                    System.out.println("Нет задач для удаления!");
                } else {
                    int i = 1;  //  переменная для индекса внетри листа
                    for (String task : tasks) {
                        System.out.println(i + ") " + task);
                        i++;
                    }
                    System.out.println("Выберите номер задачи для удаления:");
                    int rem = Integer.parseInt(scanner.nextLine());
                    tasks.remove(rem);
                    System.out.println("---------------------" + "\n" +
                            "Удалена задача" + rem + "\n" +
                            "---------------------");
                }
            }

            if (choose > 3) {
                System.out.println("-------------------------------" + "\n" +
                        "Нет такого пункта действий! Выберите из списка." + "\n" +
                        "-----------------------------");
            }
        }
    }
}


