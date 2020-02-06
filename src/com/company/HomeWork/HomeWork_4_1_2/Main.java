package com.company.HomeWork.HomeWork_4_1_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        while (true) {
            System.out.println("Введите информацию о сотруднике (фамилию, имя, год рождения, пол, образование, должность, отдел");

            System.out.println("Введите фамилию: ");
            String surname = scanner.nextLine();

            System.out.println("Введите имя: ");
            String name = scanner.nextLine();

            System.out.println("Введите год рождения: ");
            int yearOfBirth = Integer.parseInt(scanner.nextLine());

            System.out.println("Укажитье пол сотрудника: ");
            String sex = scanner.nextLine();

            System.out.println("Укажите образование сотрудника: ");
            String education = scanner.nextLine();

            System.out.println("Укажите должность сотрудника: ");
            String position = scanner.nextLine();

            System.out.println("В каком отделе числится сотрудник: ");
            String division = scanner.nextLine();

            Employee employee = new Employee(surname, name, yearOfBirth, sex, education, position, division);
            list.add(employee);

            System.out.println("Если хотите закончить ввод данных, введите 'end'");

            String input = scanner.nextLine();

            if ("end".equals(input)) {
                System.out.println("Фамилия\tИмя\tВозраст\tПол\tОбразование\tДолжность\tОтдел" + "\n");
                for (Employee emp : list) {
                    System.out.println(emp);
                }
                break;
            }
        }
    }
}