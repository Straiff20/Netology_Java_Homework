package com.company.HomeWork.HomeWork_4_2_2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> sign = new Stack<>();
        Queue<Integer> numbers = new ArrayDeque<>();

        System.out.println("Введите математическую формулу (например: '2 + 3'):");
        String input = scanner.nextLine();
        String[] symbols = input.split(" ");

        for (int i = 0; i < symbols.length; i++) {
            try {
                int value = Integer.parseInt(symbols[i]);
                numbers.add(value);

            } catch (NumberFormatException e) {
                sign.add(symbols[i]);
            }
        }

        while (!numbers.isEmpty()) {
            //ваш код
            Integer num = numbers.poll();
            System.out.printf("%d ", num);
        }

        while (!sign.isEmpty()) {
            //ваш код
            String sim = sign.pop();
            System.out.printf("%s", sim);
        }
    }
}
