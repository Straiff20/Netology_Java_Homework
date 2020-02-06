package com.company.HomeWork.HomeWork_3_3_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );

        // TODO главный цикл игры:
        // запрашивать номер с клавиатуры
        // с помощью scanner.nextInt(),
        // пока не будет введено -1
        while (true) {
            String input = scanner.nextLine();
            try {
                int choose = Integer.parseInt(input);
                player.shotWithWeapon(choose);
            } catch (NumberFormatException e) {
                System.out.println("Введите цифры");
            } catch (IllegalArgumentException e ) {
                System.out.println("Такого слота с оружием нет");
            }
            System.out.println();

            if ("-1".equals(input)) {
                System.out.println("Game over!");
            }
        }
    }
}
