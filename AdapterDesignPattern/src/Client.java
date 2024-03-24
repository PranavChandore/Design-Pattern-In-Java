public class Client {
    public static void main(String[] args) {


        Flipkart fp = new Flipkart(new RazorPayAdapter());

        fp.payViaRazorPay("12234324", "123", 18, 2032);


    }
}