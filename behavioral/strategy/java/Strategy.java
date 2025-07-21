package behavioral.strategy.java;

import java.math.BigDecimal;

interface PaymentStrategy {
    void pay(BigDecimal amount);
}

class CardPayment implements PaymentStrategy {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Paid " + amount + " using card.");
    }
}
class CashPayment implements PaymentStrategy {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Paid " + amount + " using cash.");
    }
}

class PaymentContext {

    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(BigDecimal amount) {
        if (strategy != null) {
            strategy.pay(amount);
        } else {
            System.out.println("Payment strategy not set.");
        }
    }
}

public class Strategy {
    
    public static void main(String[] args) {
        
        PaymentContext context = new PaymentContext();

        // using CardPayment strategy
        context.setStrategy(new CardPayment());
        context.executePayment(new BigDecimal("100.00"));

        // using CashPayment strategy
        context.setStrategy(new CashPayment());
        context.executePayment(new BigDecimal("50.00"));

    }
}
