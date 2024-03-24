public interface PaymentGateway {

    public String payViaDebitCard(String debitCardNo, int expMonth,int expYear, int cvv);

    public String payViaCreditCard(String debitCardNo, int expMonth,int expYear, int cvv);

    public Status paymentStatus(Long transctionId);

    Status paymentStatus(String transctionId);
}
