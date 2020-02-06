package com.company.HomeWork.HomeWork_3_3_2;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                // TODO создать платежи с различным типами налогообложения
                new Bill(1000, new IncomeTaxType(), new TaxService()),
                new Bill(10_000, new VATaxType(), new TaxService()),
                new Bill(99_999, new ProgressiveTaxType(), new TaxService()),
                new Bill(100_001, new ProgressiveTaxType(), new TaxService())
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
        System.out.println();
    }
}
