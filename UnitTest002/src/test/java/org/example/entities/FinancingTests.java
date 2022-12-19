package org.example.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.factory.FinancingFactory;

import static tests.factory.FinancingFactory.createFinancing;
import static tests.factory.FinancingFactory.createValidFinancing;

public class FinancingTests {

    @Test
    public void shouldNotCreateCorrectObjectWhenDataIsInvalid() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing fin = FinancingFactory.createInvalidFinancing();
        });
    }

    @Test
    public void shouldCreateCorrectObjectWhenDataIsValid() {
        Double totalAmount = 100000.0;
        Double income = 2000.0;
        Integer months = 80;

        Financing fin = createValidFinancing();

        Assertions.assertEquals(totalAmount, fin.getTotalAmount());
        Assertions.assertEquals(income, fin.getIncome());
        Assertions.assertEquals(months, fin.getMonths());
    }

    @Test
    public void shouldNotChangeAmountWhenDataIsInvalid() {
        Financing fin = FinancingFactory.createValidFinancing();
        Double newAmount = 110000.0;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            fin.setTotalAmount(newAmount);
        });

        Assertions.assertNotSame(fin.getTotalAmount(), newAmount);
    }

    @Test
    public void shouldChangeAmountWhenDataIsValid() {
        Financing fin = FinancingFactory.createValidFinancing();
        Double newAmount = 80000.0;

        fin.setTotalAmount(newAmount);

        Assertions.assertEquals(newAmount, fin.getTotalAmount());
    }

    @Test
    public void shouldSetTotalIncomeWhenDataIsValid() {
        Financing fin = FinancingFactory.createValidFinancing();
        Double newIncome = 2500.0;

        fin.setIncome(newIncome);

        Assertions.assertEquals(newIncome, fin.getIncome());

    }
    @Test
    public void shouldSetTotalIncomeWhenDataIsValid() {
        Financing fin = FinancingFactory.createValidFinancing();
        Double newIncome = 2500.0;

        fin.setIncome(newIncome);

        Assertions.assertEquals(newIncome, fin.getIncome());

    }



}
