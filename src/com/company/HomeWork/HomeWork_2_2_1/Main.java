package com.company.HomeWork.HomeWork_2_2_1;

import java.util.Random;

// Поворот матрицы

public class Main {

    static int SIZE = 8;

    public static void main(String[] args) {
        Random random = new Random();

        int[][] colors = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {  //  создаем матрицу
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        System.out.println("\n" + "Первая матрица:" + "\n");
        print(colors);
        System.out.println();

        for (int i = 0; i <= 2; i++) {
            colors = rotate(colors);
            System.out.println();
            print(colors);
        }
    }

    static void print (int[][] colors){  //  метод для вывода на экран матрицы
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
    }

    static int[][] rotate(int[][] colors) {  //  метод для поворота матрицы и ВОЗВРАЩЕНИЯ значения
        int[][] result = new int[SIZE][SIZE];     //  Если делать с void и статической переменной, то на втором выполнениии цикла "поворота" значения идут в разнобой
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                result[i][j] = colors[SIZE - 1 - j][i];
            }
        }
        return result;
    }
}