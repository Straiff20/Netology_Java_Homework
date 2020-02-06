package com.company.HomeWork.HomeWork_2_2_3;

import java.util.Scanner;

// Крестики-нолики
public class Main {
    public static void main(String[] args) {
        char[][] motions = new char[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            System.out.println("Ход игрока 1, введите коодинаты Х (через пробел)");
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            motions[x1][y1] = 'X';

            System.out.println("Ход игрока 1, введите коодинаты Х (через пробел)");
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            motions[x2][y2] = '0';

            printField(motions);

            if (checkStatus(motions)) {
                System.out.println("Игра окончена");
                break;
            }
        }
        System.out.println("Игра окончена");
    }

    public static void printField(char[][] motions) {
        for (int i = 0; i < motions.length; i++) {
            for (int j = 0; j < motions[i].length; j++) {
                System.out.printf("%s ", motions[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean checkStatus(char[][] motions) {
        //lines
        if (motions[0][0] != 0 && motions[0][0] == motions[0][1] && motions[0][1] == motions[0][2]) {
            System.out.printf("Выиграл %s\n", motions[0][1]);
            return true;
        }
        if (motions[1][0] != 0 && motions[1][0] == motions[1][1] && motions[1][1] == motions[1][2]) {
            System.out.printf("Выиграл %s\n", motions[1][0]);
            return true;
        }
        if (motions[2][0] != 0 && motions[2][0] == motions[2][1] && motions[2][1] == motions[2][2]) {
            System.out.printf("Выиграл %s\n", motions[2][0]);
            return true;
        }
        //rows
        if (motions[0][0] != 0 && motions[0][0] == motions[1][0] && motions[1][0] == motions[2][0]) {
            System.out.printf("Выиграл %s\n", motions[0][0]);
            return true;
        }
        if (motions[0][1] != 0 && motions[0][1] == motions[1][1] && motions[1][1] == motions[2][1]) {
            System.out.printf("Выиграл %s\n", motions[1][0]);
            return true;
        }
        if (motions[0][2] != 0 && motions[0][2] == motions[1][2] && motions[1][2] == motions[2][2]) {
            System.out.printf("Выиграл %s\n", motions[2][0]);
            return true;
        }
        //diagonals
        if (motions[0][0] != 0 && motions[0][0] == motions[1][1] && motions[1][1] == motions[2][2]) {
            System.out.printf("Выиграл %s\n", motions[0][0]);
            return true;
        }
        if (motions[0][2] != 0 && motions[0][2] == motions[1][1] && motions[1][1] == motions[2][0]) {
            System.out.printf("Выиграл %s\n", motions[0][0]);
            return true;
        }
        return false;
    }
}

