package com.company.HomeWork.HomeWork_3_3_2;

public class IncomeTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        return amount / 100 * 13;  //  подоходный налог
    }
}
