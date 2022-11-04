/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author ramir
 */
public class Entry {
    
    private String origin;
    private String cargoType;
    private String depot;
    private String dpiDriver;
    private String plateTruck;
    private String transporter;
    private String lot;
    private String time;
    private String day;
    
    public Entry(String time, String day, String origin, String cargoType, String depot, String dpiDriver, String plateTruck, String transporter, String lot) {
        this.origin = origin;
        this.time = time;
        this.day = day;
        this.cargoType = cargoType;
        this.depot = depot;
        this.dpiDriver = dpiDriver;
        this.plateTruck = plateTruck;
        this.transporter = transporter;
        this.lot = lot;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDpiDriver() {
        return dpiDriver;
    }

    public void setDpiDriver(String dpiDriver) {
        this.dpiDriver = dpiDriver;
    }
    
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public String getDepot() {
        return depot;
    }

    public void setDepot(String depot) {
        this.depot = depot;
    }

    public String getPlateTruck() {
        return plateTruck;
    }

    public void setPlateTruck(String plateTruck) {
        this.plateTruck = plateTruck;
    }

    public String getTransporter() {
        return transporter;
    }

    public void setTransporter(String transporter) {
        this.transporter = transporter;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }
    
    
    
}
