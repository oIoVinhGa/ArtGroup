/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;


import Helper.XDateHelper;
import java.util.Date;

/**
 *
 * @author pc
 */
public class ImportBill {

    private String importBillID, employeeID, wareHouseID, payMentStatusID, note, createdBy;
    private Date createDate = XDateHelper.nowDate();
    private Double totalAmount, totalPay;
    private boolean status;

    public ImportBill() {
    }

    public ImportBill(String importBillID, String employeeID, String wareHouseID, String payMentStatusID, String note, String createdBy, Double totalAmount, Double totalPay, boolean status) {
        this.importBillID = importBillID;
        this.employeeID = employeeID;
        this.wareHouseID = wareHouseID;
        this.payMentStatusID = payMentStatusID;
        this.note = note;
        this.createdBy = createdBy;
        this.totalAmount = totalAmount;
        this.totalPay = totalPay;
        this.status = status;
    }

    

    @Override
    public String toString() {
        return this.importBillID;
    }

    
    
    public String getImportBillID() {
        return importBillID;
    }

    public void setImportBillID(String importBillID) {
        this.importBillID = importBillID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getWareHouseID() {
        return wareHouseID;
    }

    public void setWareHouseID(String wareHouseID) {
        this.wareHouseID = wareHouseID;
    }

    public String getPayMentStatusID() {
        return payMentStatusID;
    }

    public void setPayMentStatusID(String payMentStatusID) {
        this.payMentStatusID = payMentStatusID;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(Double totalPay) {
        this.totalPay = totalPay;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
