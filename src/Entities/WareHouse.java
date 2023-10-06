/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author pc
 */
public class WareHouse {

    private String WareHouseID, WareHouseName;

    public WareHouse() {
    }

    public WareHouse(String WareHouseID, String WareHouseName) {
        this.WareHouseID = WareHouseID;
        this.WareHouseName = WareHouseName;
    }

    @Override
    public String toString() {
        return this.WareHouseName;
    }

    public String getWareHouseID() {
        return WareHouseID;
    }

    public void setWareHouseID(String WareHouseID) {
        this.WareHouseID = WareHouseID;
    }

    public String getWareHouseName() {
        return WareHouseName;
    }

    public void setWareHouseName(String WareHouseName) {
        this.WareHouseName = WareHouseName;
    }

}
