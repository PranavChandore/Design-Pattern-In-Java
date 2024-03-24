import PayUmoney.PayUMoney;

public class PayUMoneyAdapter implements PaymentGateway {

    PayUMoney payUMoney = new PayUMoney();
    @Override
    public String payViaDebitCard(String debitCardNo, int expMonth, int expYear, int cvv) {

        String cvvId = String.valueOf(cvv);

        String expiry = String.valueOf(expMonth) + "/" + String.valueOf(expYear);

        String ans = payUMoney.payViaDebitCard(debitCardNo, cvvId,expiry);

        return ans;
    }

    @Override
    public String payViaCreditCard(String debitCardNo, int expMonth, int expYear, int cvv) {
        return null;
    }

    @Override
    public Status paymentStatus(Long transctionId) {
        return null;
    }

    @Override
    public Status paymentStatus(String transctionId) {
        return null;
    }
}
