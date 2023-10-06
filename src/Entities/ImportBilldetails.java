/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.Date;

/**
 *
 * @author pc
 */
public class ImportBilldetails {
    String importBillID, ProductID, notes;
    int quantityInBox, quantityBox, totalQuantity, importBillDetailsID;
    double totalAmount, intoMoney;
    String ManufacturingDate, ExpiryDate;

    public ImportBilldetails() {
    }

    public ImportBilldetails(int importBillDetailsID, String importBillID, String ProductID, String notes, int quantityInBox, int quantityBox, int totalQuantity, double totalAmount, double intoMoney, String ManufacturingDate, String ExpiryDate) {
        this.importBillDetailsID = importBillDetailsID;
        this.importBillID = importBillID;
        this.ProductID = ProductID;
        this.notes = notes;
        this.quantityInBox = quantityInBox;
        this.quantityBox = quantityBox;
        this.totalQuantity = totalQuantity;
        this.totalAmount = totalAmount;
        this.intoMoney = intoMoney;
        this.ManufacturingDate = ManufacturingDate;
        this.ExpiryDate = ExpiryDate;
    }

    public int getImportBillDetailsID() {
        return importBillDetailsID;
    }

    public void setImportBillDetailsID(int importBillDetailsID) {
        this.importBillDetailsID = importBillDetailsID;
    }

    public String getImportBillID() {
        return importBillID;
    }

    public void setImportBillID(String importBillID) {
        this.importBillID = importBillID;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getQuantityInBox() {
        return quantityInBox;
    }

    public void setQuantityInBox(int quantityInBox) {
        this.quantityInBox = quantityInBox;
    }

    public int getQuantityBox() {
        return quantityBox;
    }

    public void setQuantityBox(int quantityBox) {
        this.quantityBox = quantityBox;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getIntoMoney() {
        return intoMoney;
    }

    public void setIntoMoney(double intoMoney) {
        this.intoMoney = intoMoney;
    }

    public String getManufacturingDate() {
        return ManufacturingDate;
    }

    public void setManufacturingDate(String ManufacturingDate) {
        this.ManufacturingDate = ManufacturingDate;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(String ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }
    
    
}
