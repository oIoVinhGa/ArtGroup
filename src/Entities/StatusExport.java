
package Entities;

/**
 *
 * @author LinhptPC04737
 */
public class StatusExport {

    private String StatusID;
    private String StatusName;

    public StatusExport() {
    }

    public StatusExport(String StatusID, String StatusName) {
        this.StatusID = StatusID;
        this.StatusName = StatusName;
    }

    @Override
    public String toString() {
        return this.StatusName;
    }

    public String getStatusID() {
        return StatusID;
    }

    public void setStatusID(String StatusID) {
        this.StatusID = StatusID;
    }

    public String getStatusName() {
        return StatusName;
    }

    public void setStatusName(String StatusName) {
        this.StatusName = StatusName;
    }

}
