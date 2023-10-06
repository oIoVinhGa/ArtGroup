package Entities;

import java.util.Date;

/**
 *
 * @author LinhptPC04737
 */
public class ExportBill {

    private String exportID, employeeID, note, createdBy;
    private int statusExport,wareHouseID;
    private Long totalAmount;
    private Date createdDate;
    private boolean deleted;

    public ExportBill() {
    }

    public ExportBill(String exportID, String employeeID, String note, String createdBy, int wareHouseID, int statusExport, Long totalAmount, Date createdDate, boolean deleted) {
        this.exportID = exportID;
        this.employeeID = employeeID;
        this.note = note;
        this.createdBy = createdBy;
        this.wareHouseID = wareHouseID;
        this.statusExport = statusExport;
        this.totalAmount = totalAmount;
        this.createdDate = createdDate;
        this.deleted = deleted;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getExportID() {
        return exportID;
    }

    public void setExportID(String exportID) {
        this.exportID = exportID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
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

    public int getWareHouseID() {
        return wareHouseID;
    }

    public void setWareHouseID(int wareHouseID) {
        this.wareHouseID = wareHouseID;
    }

    public int getStatusExport() {
        return statusExport;
    }

    public void setStatusExport(int statusExport) {
        this.statusExport = statusExport;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return this.exportID;
    }

}
