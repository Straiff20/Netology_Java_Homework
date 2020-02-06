package com.company.HomeWork.HomeWork_3_3_2;

public class ProgressiveTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        if (amount <= 100_000) {
            return amount / 100 * 10;
        }
        if (amount >= 100_000) {
            return amount / 100 * 15;
        }
        return 0.0;
    }
}
