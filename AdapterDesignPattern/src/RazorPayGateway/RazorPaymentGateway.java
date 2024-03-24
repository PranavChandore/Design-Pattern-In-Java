package RazorPayGateway;

public class RazorPaymentGateway{

    public String paymentviaDebitCard(String debitCardNo , String cvv, String expiry){
        System.out.println("Payment is done by RazorPay");


        return "12123143";
    }

    public String paymentviaCreditCard(String debitCardNo , String cvv, String expiry)
    {
        System.out.println("Payment is done by Razorpay creditCard");

        return "CreditCard";
    }

    public  boolean transactioStatus(Long transactionId){
        return false;
    }



}
