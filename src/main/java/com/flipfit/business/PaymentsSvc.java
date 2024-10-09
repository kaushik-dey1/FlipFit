package com.flipfit.business;

public interface PaymentsSvc {
    boolean validateCardDetails(Payments payments);
    int requestOTP(Payments payments);
    boolean validateOTP(int serverOTP);
    boolean collectCardDetails();
    boolean validateCardDetails();
    void requestOTP();
    void processPayment();
}
