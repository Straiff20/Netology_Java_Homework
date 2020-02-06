package com.company.HomeWork.HomeWork_3_3_2;

public class VATaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        return amount / 100 * 18;  //
    }
}
