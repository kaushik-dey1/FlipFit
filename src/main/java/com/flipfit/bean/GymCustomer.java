/**
 *
 */
package com.flipfit.bean;

/**
 *
 */
public class GymCustomer extends User {
  public int paymentType;
  public String paymentInfo;

  public int getPaymentType() {
    return paymentType;
  }
  public void setPaymentType(int paymentType) {
    this.paymentType = paymentType;
  }
  public String getPaymentInfo() {
    return paymentInfo;
  }
  public void setPaymentInfo(String paymentInfo) {
    this.paymentInfo = paymentInfo;
  }
}