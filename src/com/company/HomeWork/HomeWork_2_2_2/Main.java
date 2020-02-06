package com.company.HomeWork.HomeWork_2_2_2;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static int SIZE = 10;                           //  размер масиива
    static int MAX_COUNT = 10;                      //  максимальное число кораблей
    static int TURN = 30;                           //  количество ходов

    static int EMPTY = 0;                           //  пустая ячейка
    static int SHIP = 1;                            //  корабль

    static int DEAD = 2;                            //  умер
    static int MISS = 3;                            //  промах

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[][] warField = new int[SIZE][SIZE];  //  игровое поле

        int shoot_x = 0;
        int shoot_y = 0;

        //  заполняем поле 10X10 кораблями в случайном порядке
        for (int i = 0; i < MAX_COUNT; i++) {
            int shpPlace_1 = random.nextInt(SIZE);
            int shpPlace_2 = random.nextInt(SIZE);

            if (warField[shpPlace_1][shpPlace_2] == SHIP) {
                //  повторная генерация положения для данного корабля
                i--;
            }
            warField[shpPlace_1][shpPlace_2] = SHIP;
        }
        print(warField);

        while (true) {
            System.out.println("Введите координаты выстрела через пробел: ");
            String input = scanner.nextLine();

            String[] shoot = input.split(" ");
            shoot_x = Integer.parseInt(shoot[0]);
            shoot_y = Integer.parseInt(shoot[1]);

            int damage = warField[shoot_x - 1][shoot_y - 1];
//            if (damage ==) {

        }

    }


    static void print(int[][] warField) {  //  метод для вывода на экран матрицы
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("__|", warField[i][j]);
                if (warField[i][j] == MISS) {
                    System.out.format(".|", warField[i][j]);
                }
                if (warField[i][j] == DEAD) {
                    System.out.format("X| ", warField[i][j]);
                }
            }
            System.out.println();
        }
    }

}




