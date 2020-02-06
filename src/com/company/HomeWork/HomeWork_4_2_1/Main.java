package com.company.HomeWork.HomeWork_4_2_1;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {

    public static final int WAIT_DOORS_IN_SECONDS = 10;  //  закрытие и открытие дверей
    public static final int WAIT_MOVE_IN_SECONDS = 5;  //  время на движение между этажами

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>(); //  не сортирует этажи по возрастанию, в отличие от PriorityQueue

        int totalSeconds = 0;  //  всего времени подрачено
        int previousFloor = 0;  //  предыдущая остановка

        while (true) {
            System.out.println("Укажите этаж от 0 до 25");
            int floor;

            try {
                floor = scanner.nextInt();
                if (floor < 0 || floor > 25) {
                    System.out.println("Вы ввели неккоректный этаж. Попробуйте снова.");
                    continue;
                }

                if (floor == 0 && queue.isEmpty()) {
                    System.out.println("Лифт уже на нулевом этаже.");
                    continue;
                }

                totalSeconds += Math.abs(floor - previousFloor) * WAIT_MOVE_IN_SECONDS + WAIT_DOORS_IN_SECONDS;

                queue.add(floor);

                previousFloor = floor;

                if (floor == 0) {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите этаж еще раз.");
                scanner.nextLine();
            }

        }

        System.out.println("Лифт в движении");

        while (!queue.isEmpty()) {
            Integer floor = queue.poll();
            System.out.printf("Этаж %d", floor);

            if(queue.size() >= 1)
            {
                System.out.print(" -> ");
            }
        }

        System.out.println("\n" + "Время затраченное лифтом на маршрут: " + totalSeconds + " с.");
    }
}
