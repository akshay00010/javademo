package Inheritance;

public class Paymentservice
{
    public String payment(double amount,String typeOfPayment){
        if ("card".equalsIgnoreCase(typeOfPayment)){
            double charges = (amount*2)/100;
            double finalAmount = amount+charges;
        }

    }

}
