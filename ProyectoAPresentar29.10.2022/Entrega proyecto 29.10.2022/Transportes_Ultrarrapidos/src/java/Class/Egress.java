/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author ramir
 */
public class Egress{
    
   
    private String cargoType;
    private int trans;
    private String destiny;
    private String plateTruck;
    private int lot;
    private String time;
    private String day;
    private int depot;
    
    public Egress (int lot, int depot, String plateTruck,int trans, String time, String day, String destiny, String cargoType ) {
       this.lot=lot;
       this.depot=depot;
       this.plateTruck=plateTruck;
       this.trans=trans;
       this.time=time;
       this.day=day;
      this.destiny=destiny;
       this.cargoType=cargoType;
       
       
        
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public int getTrans() {
        return trans;
    }

    public void setTrans(int trans) {
        this.trans = trans;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public String getPlateTruck() {
        return plateTruck;
    }

    public void setPlateTruck(String plateTruck) {
        this.plateTruck = plateTruck;
    }

    public int getLot() {
        return lot;
    }

    public void setLot(int lot) {
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

    public int getDepot() {
        return depot;
    }

    public void setDepot(int depot) {
        this.depot = depot;
    }

}
