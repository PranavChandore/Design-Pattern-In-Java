
import RazorPayGateway.RazorPaymentGateway;

public class RazorPayAdapter implements PaymentGateway{

    RazorPaymentGateway razorPaymentGateway = new RazorPaymentGateway();

    @Override
    public String payViaDebitCard(String debitCardNo, int expMonth, int expYear, int cvv) {

        String expDate = String.valueOf(expMonth) +"/" + String.valueOf(expYear);
        String cvvId = String.valueOf(cvv);

        String ans = razorPaymentGateway.paymentviaDebitCard(debitCardNo, cvvId, expDate);

        return ans;


    }

    @Override
    public String payViaCreditCard(String debitCardNo, int expMonth, int expYear, int cvv) {
        String expDate = String.valueOf(expMonth) +"/" + String.valueOf(expYear);
        String cvvId = String.valueOf(cvv);

        String ans = razorPaymentGateway.paymentviaCreditCard(debitCardNo, cvvId, expDate);

        return ans;
    }

    @Override
    public Status paymentStatus(Long transctionId) {
        boolean status = razorPaymentGateway.transactioStatus(Long.valueOf(String.valueOf(String.valueOf(transctionId))));

        if(status){
            return Status.Succsess;
        }else{
            return Status.Failed;
        }
    }

    @Override
    public Status paymentStatus(String transctionId) {

       boolean status = razorPaymentGateway.transactioStatus(Long.valueOf(String.valueOf(String.valueOf(transctionId))));

       if(status){
           return Status.Succsess;
       }else{
           return Status.Failed;
       }


    }
}
