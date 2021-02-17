/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptreply.demand;

import conceptreply.car.CarInfotainmentSystem;
import conceptreply.car.CarInteriorDesign;
import conceptreply.car.CarModel;
import conceptreply.car.EngineType;
import conceptreply.car.Location;
import conceptreply.user.User;
import java.util.Date;

/**
 *
 * @author kyaprakci
 */
public class Demand {
    private final int demandId; 
    private final User demandingUser;
    private Location pickUpLoc;
    private Location dropOffLoc;
    private Date earliestPickUpDate;
    private Date latestDropOffDate;
    private CarModel carModel;
    private EngineType engineType;
    private CarInfotainmentSystem carInfotainmentSystem;
    private CarInteriorDesign carInteriorDesign;
    
    private Demand(){
        this.demandId = -1;
        this.demandingUser = null;
    }
    
    public Demand(int demandId, User demandingUser, Location pickUpLoc, Location dropOffLoc, Date earliestPickUpDate, Date latestDropOffDate, CarModel carModel, EngineType engineType, CarInfotainmentSystem carInfotainmentSystem, CarInteriorDesign carInteriorDesign){
        this.demandId = demandId;
        this.demandingUser = demandingUser;
        this.pickUpLoc = pickUpLoc;
        this.dropOffLoc = dropOffLoc;
        this.earliestPickUpDate = earliestPickUpDate;
        this.latestDropOffDate = latestDropOffDate;
        this.carModel = carModel;
        this.engineType = engineType;
        this.carInfotainmentSystem = carInfotainmentSystem;
        this.carInteriorDesign = carInteriorDesign;
    }
    
    public int getDemandId(){
        return this.demandId;
    }
    
    public User getDemandingUser(){
        return this.demandingUser;
    }
    
    public Location getPickUpLocation(){
        return this.pickUpLoc;
    }
    
    public Location getDropOffLocation(){
        return this.dropOffLoc;
    }
    
    public Date getEarliestPickUpDate(){
        return this.earliestPickUpDate;
    }
    
    public Date getLatestDropOffDate(){
        return this.latestDropOffDate;
    }
    
    public CarModel getCarModel(){
        return this.carModel;
    }
    
    public EngineType getEngineType(){
        return this.engineType;
    }
    
    public CarInfotainmentSystem getCarInfotainmentSystem(){
        return this.carInfotainmentSystem;
    }
    
    public CarInteriorDesign getCarInteriorDesign(){
        return this.carInteriorDesign;
    }
    
    public void setPickUpLocation(Location pickUpLoc){
        this.pickUpLoc = pickUpLoc;
    }
    
    public void setDropOffLocation(Location dropOffLoc){
        this.dropOffLoc = dropOffLoc;
    }
    
    public void setEarliestPickUpDate(Date earliestPickUpDate){
        this.earliestPickUpDate = earliestPickUpDate;
    }
    
    public void setLatestDropOffDate(Date latestDropOffDate){
        this.latestDropOffDate = latestDropOffDate;
    }
    
    public void setCarModel(CarModel carModel){
        this.carModel = carModel;
    }
    
    public void setEngineType(EngineType engineType){
        this.engineType = engineType;
    }
    
    public void setCarInfotainmentSystem(CarInfotainmentSystem carInfotainmentSystem){
        this.carInfotainmentSystem = carInfotainmentSystem;
    }
    
    public void setCarInteriorDesign(CarInteriorDesign carInteriorDesign){
        this.carInteriorDesign = carInteriorDesign;
    }
}
