interface PaymentProcessor {
    void processPayment(double amount);
}

class PayPalPaymentProcessor {
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }
}

class PaymentAdapter implements PaymentProcessor {
    private PayPalPaymentProcessor payPalPaymentProcessor;

    public PaymentAdapter(PayPalPaymentProcessor payPalPaymentProcessor) {
        this.payPalPaymentProcessor = payPalPaymentProcessor;
    }

    @Override
    public void processPayment(double amount) {
        payPalPaymentProcessor.makePayment(amount);
    }
}


public class AdaptePayment {
    
    public static void main(String[] args) {
        PayPalPaymentProcessor payPalPaymentProcessor = new PayPalPaymentProcessor();
        PaymentProcessor paymentProcessor = new PaymentAdapter(payPalPaymentProcessor);
        paymentProcessor.processPayment(100.0);
    }
}
