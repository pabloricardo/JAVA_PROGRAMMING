package services;

public class PaypalService implements OnlinePaymentService{

    private final static double PAYMENT_FEE = 0.02;
    private final static double MONTHLY_INTEREST = 0.01;


    @Override
    public Double paymentFee(Double amount) {
        return amount * PAYMENT_FEE;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return amount * months * MONTHLY_INTEREST;
    }
}
