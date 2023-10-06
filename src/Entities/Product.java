/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;
import Helper.XDateHelper;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author pc
 */
public class Product {
    private String productID;
    private String supplierID;
    private String productName;
    private String imageProduct;
    private int productTypes;
    private Double productPrice;
    private int unit;
    private String note;
    private Date createDate = XDateHelper.nowDate();
    private String createBy;
    private boolean status;
    
    public Product() {
    }

    public Product(String productID, String supplierID, String productName, String imageProduct, int productTypes, Double productPrice, int unit, String note, Date createDate, String createBy, boolean status) {
        this.productID = productID;
        this.supplierID = supplierID;
        this.productName = productName;
        this.imageProduct = imageProduct;
        this.productTypes = productTypes;
        this.productPrice = productPrice;
        this.unit = unit;
        this.note = note;
        this.createDate = createDate;
        this.createBy = createBy;
        this.status = status;
    }

    @Override
    public String toString() {
        return this.productName;
    }
    
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImageProduct() {
        return imageProduct;
    }

    public void setImageProduct(String imageProduct) {
        this.imageProduct = imageProduct;
    }

    public int getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(int productTypes) {
        this.productTypes = productTypes;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
