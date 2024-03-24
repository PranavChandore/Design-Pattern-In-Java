public class Flipkart {


    PaymentGateway paymentGateway;

    Flipkart(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public void payViaRazorPay(String debitCardNo, String cvv , int  expMonth,int expDate){

        String transationId = String.valueOf(Long.valueOf(paymentGateway.payViaDebitCard(debitCardNo,expMonth,expDate, Integer.parseInt(cvv))));

        while(!paymentGateway.paymentStatus(transationId).equals(Status.Failed))
        {
            System.out.println("wating");
        }
    }

    public void payViaPayUMoney(String debitCardNo, String cvv , int  expMonth,int expDate){

        String transationId = String.valueOf(Long.valueOf(paymentGateway.payViaDebitCard(debitCardNo,expMonth,expDate, Integer.parseInt(cvv))));

        while(!paymentGateway.paymentStatus(transationId).equals(Status.Failed))
        {
            System.out.println("wating");
        }
    }

    public Status paymentStatus(String id){

        return null;
    }






}
