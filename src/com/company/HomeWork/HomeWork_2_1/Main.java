package com.company.HomeWork.HomeWork_2_1;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String[] products = new String[]{"Хлеб", "Яблоки", "Молоко"};
        int[] prices = new int[]{100, 200, 300};
        int[] bascet = new  int[]{ 0, 0, 0};  //  количество положенных товаров
        int iteration = 0;  //  переменная для количества пройденных циклов

        System.out.println(Arrays.toString(products));
        System.out.println(Arrays.toString(prices));

        int productNumber = 0;  //  переменная для номера продукта
        int productCount = 0;  //  переменная для количества
        int  totalPay = 0;  //  общая цена

        while (true) {
            System.out.println("Выберите порядковый номер товара и количество через пробел");
            System.out.println("Введите 'end' для завершения");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                for (int i = 0; i < bascet.length; i++) {
                    if (bascet[i] != 0) {
                        System.out.println("Наименование: " + products[i] + " в количестве " +  bascet[i] + " за " + prices[i] + "р. за ед.");
                    }
                }
                System.out.println("К оплате " + totalPay + "р.");
                break;
            }

            try {
                int result = Integer.parseInt(input);  //  проверка на то что введено целое число
            } catch (NumberFormatException e) {
                System.out.println("Введите целое число");
            }

            String[] choose = input.split(" ");
            productNumber = Integer.parseInt(choose[0]);  //  номер товара
            productCount = Integer.parseInt(choose[1]);  //  количество товара

            bascet[productNumber - 1] = bascet[productNumber - 1] + productCount;  //  в ячейку массива кладется товар и его количество

            int currentPrice = prices[productNumber - 1];  //  берется цена из массива price
            int check = currentPrice * productCount;

            totalPay = totalPay + check;
        }
    }
}


                        /*click = click + 1;  //  каждый проход цикла увеличивается на 1
            String[] basket = new String[click];

            for (int i = 0; i < basket2.length; i++) {
                basket[i] = basket2[i];
            }

            basket[click - 1] = input;
            basket2 = basket.clone();*/




        /*for (int i = 0; i < basket2.length; i++) {
            System.out.println(basket2[i]);
        }*/

// Создали массив
       /* Product[] shop = {
                new Product("Хлеб", 50),
                new Product("Яблоки", 120),
                new Product("Молоко", 115),
        };

        for (int i = 0; i < shop.length; i++) {
            System.out.println((i + 1) + ") " + shop[i]);
        }

        int click = 0;  //  количество выполнения цикла while
        String[] totalBasket = new String[]{};  //  выбор товаров в корзине
        String[] totalQuantity = new String[]{};  //  количество выбранного товара
        String[] totalPrice = new String[]{};  //  массив с суммой за покупку

        while (true) {                  // выбираем товар и количество
            System.out.println("Выберите порядковый номер товара и количество через пробел");
            System.out.println("Введите 'end' для завершения");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if ("end".equals(input) || click == shop.length) {  //  заканчиваем программу, если введен "end" ИЛИ положены все товары
                System.out.println("Программа завершена");
                break;
            }

            try {
                int result = Integer.parseInt(input);  //  проверка на то что введено целое число
            } catch (NumberFormatException e) {
                System.out.println("Введите целое число");
            }

            click = click + 1;  //  количество пройденых циклов
            String[] choice = input.split(" ");  //  создаем массив из введенного значения. Выбранный продукт/количество

            String[] bascet = new String[click];  //  создаем массив с выбранными товарами равный количеству пройденных циклов
            for (int i = 0; i < totalBasket.length; i++) {
                bascet[i] = totalBasket[i];  //  кладем в массив ранее положенные товары
            }
            bascet[click - 1] = choice[0];  //  в массив с выбранными продуктами кладем первое значение из input.split

            String[] quantity = new String[click];  //  создаем массив из введенных количеств товаров равный количеству пройденных циклов
            for (int i = 0; i < totalQuantity.length; i++) {
                quantity[i] = totalQuantity[i];  //  кладем в массив ранее положенные количества товаров
            }
            quantity[click - 1] = choice[1];  //  в массив с выбранными количествами продуктов кладем второе значение из input.split

            totalBasket = bascet.clone();  //  создаем копию массива с товарами
            totalQuantity = quantity.clone();  //  создаем копию массива с количествами

            //TODO: посчитать финальную стоимость и вывести на экран*/










