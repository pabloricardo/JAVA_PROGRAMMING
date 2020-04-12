package services;

import entities.Contract;
import entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){
        double paymentPerMonth = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            Date date = addMonths(contract.getDate(), i);
            double monthlyInterest = paymentPerMonth + onlinePaymentService.interest(paymentPerMonth, i);
            double paymentOfThisMonthly = monthlyInterest + onlinePaymentService.paymentFee(monthlyInterest);
            contract.addInstallment(new Installment(date, paymentOfThisMonthly));
        }
    }

    public Date addMonths(Date date, Integer months){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH,months);
        return cal.getTime();
    }

}
