package com.company.HomeWork.Homework_1_4_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";

        while (true) {
            System.out.println("Введите ASCII код (end для вывода результата)");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            } else {
                int value = Integer.parseInt(input, 8);
                char c = (char) value;
                str = str + c;
            }
        }

        System.out.println("Результат: " + str);

    }

}