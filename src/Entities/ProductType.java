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
public class ProductType {
    private String productTypeID;
    private String productTypeName;
    private Date createDate = XDateHelper.nowDate();
    private String createBy;
    private boolean status;

    public ProductType() {
    }

    public ProductType(String productTypeID, String productTypeName, Date createDate, String createBy, boolean status) {
        this.productTypeID = productTypeID;
        this.productTypeName = productTypeName;
        this.createDate = createDate;
        this.createBy = createBy;
        this.status = status;
    }

    @Override
    public String toString() {
        return this.productTypeName;
    }
    
    public String getProductTypeID() {
        return productTypeID;
    }

    public void setProductTypeID(String productTypeID) {
        this.productTypeID = productTypeID;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
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
