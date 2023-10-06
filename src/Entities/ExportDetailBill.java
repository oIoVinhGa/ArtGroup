/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author ann11
 */
public class ExportDetailBill {

    private int detailID;
    private String exportID;
    private String productID;
    private String productName;
    private double price;
    private int amount;
    private double totalAmount;
    private String note;

    public ExportDetailBill() {
    }

    public ExportDetailBill(int detailID, String exportID, String productID, String productName, double price, int amount, double totalAmount, String note) {
        this.detailID = detailID;
        this.exportID = exportID;
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.amount = amount;
        this.totalAmount = totalAmount;
        this.note = note;
    }

    

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    
    public int getDetailID() {
        return detailID;
    }

    public void setDetailID(int detailID) {
        this.detailID = detailID;
    }

    public String getExportID() {
        return exportID;
    }

    public void setExportID(String exportID) {
        this.exportID = exportID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
