/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author pc
 */
public class PaymentStatus {

    private String PaymentStatusID;
    private String PaymentStatusName;

    public PaymentStatus() {
    }

    public PaymentStatus(String PaymentStatusID, String PaymentStatusName) {
        this.PaymentStatusID = PaymentStatusID;
        this.PaymentStatusName = PaymentStatusName;
    }

    @Override
    public String toString() {
        return this.PaymentStatusName;
    }

    public String getPaymentStatusID() {
        return PaymentStatusID;
    }

    public void setPaymentStatusID(String PaymentStatusID) {
        this.PaymentStatusID = PaymentStatusID;
    }

    public String getPaymentStatusName() {
        return PaymentStatusName;
    }

    public void setPaymentStatusName(String PaymentStatusName) {
        this.PaymentStatusName = PaymentStatusName;
    }

}
