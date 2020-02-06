package com.company.HomeWork.Homework_1_5_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String result = extraTrim(input);  // используем функцию замены нескольких пробелов на один

        System.out.println(result);
    }

    static String extraTrim(String input) {  // функция замены нескольких пробелов на один
        String regex = "\\s+";
        return input.replaceAll(regex, " ");
    }
}