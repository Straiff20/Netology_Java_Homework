package com.company.HomeWork.HomeWork_3_4_1;

import com.company.HomeWork.HomeWork_3_4_1.SomePeople.Supplier;
import com.company.HomeWork.HomeWork_3_4_1.SomePeople.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Supplier supplier = new Supplier();

        user.returnBook();
        System.out.println();

        supplier.giveBookToLibrary();
        System.out.println();
    }
}
