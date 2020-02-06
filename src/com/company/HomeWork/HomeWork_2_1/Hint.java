package com.company.HomeWork.HomeWork_2_1;

import java.util.Scanner;

public class Hint {
    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        n = in.nextInt();  //  переменная в которой лежит то что ввел пользователь
        a = new int[n];  //  размером массива задали то чтоо ввел пользователь
        for (int i = 0; i < n; i++) {
            System.out.println("Введите a[" + i + "] = ");
            a[i] = in.nextInt();  //  заполняем каждую ячейку массива числами
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println( "В массиве лежит: " + a[i]);
        }
    }
}
