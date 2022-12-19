package tests.factory;

import org.example.entities.Financing;

public class FinancingFactory {
    public static Financing createFinancing(
            Double totalAmount,
            Double income,
            Integer months) {
        return new Financing(totalAmount,income,months);
    }

   public static Financing createValidFinancing(){
       Double totalAmount = 100000.0;
       Double income = 2000.0;
       Integer months = 80;
       return new Financing(totalAmount,income,months);
   }
   public static Financing createInvalidFinancing(){
       Double totalAmount = 100000.0;
       Double income = 2000.0;
       Integer months = 20;
       return new Financing(totalAmount,income,months);
   }
}
