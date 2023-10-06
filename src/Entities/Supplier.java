package Entities;

import java.util.Date;

/**
 *
 * @author tpvin
 */
public class Supplier {

    private String SupplierID;
    private String SupplierName;
    private String SupplierAdress;
    private String SupplierPhone;
    private String SupplierDetail;
    private Date CreateDate;
    private String CreateBy;

    public Supplier(String SupplierID, String SupplierName, String SupplierAdress, String SupplierPhone, String SupplierDetail, Date CreateDate, String CreateBy) {
        this.SupplierID = SupplierID;
        this.SupplierName = SupplierName;
        this.SupplierAdress = SupplierAdress;
        this.SupplierPhone = SupplierPhone;
        this.SupplierDetail = SupplierDetail;
        this.CreateDate = CreateDate;
        this.CreateBy = CreateBy;
    }

    public Supplier() {
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date CreateDate) {
        this.CreateDate = CreateDate;
    }

    public String getCreateBy() {
        return CreateBy;
    }

    public void setCreateBy(String CreateBy) {
        this.CreateBy = CreateBy;
    }

    public String getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(String SupplierID) {
        this.SupplierID = SupplierID;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public String getSupplierAdress() {
        return SupplierAdress;
    }

    public void setSupplierAdress(String SupplierAdress) {
        this.SupplierAdress = SupplierAdress;
    }

    public String getSupplierPhone() {
        return SupplierPhone;
    }

    public void setSupplierPhone(String SupplierPhone) {
        this.SupplierPhone = SupplierPhone;
    }

    public String getSupplierDetail() {
        return SupplierDetail;
    }

    public void setSupplierDetail(String SupplierDetail) {
        this.SupplierDetail = SupplierDetail;
    }

    @Override
    public String toString() {
        return this.SupplierName;
    }
}
