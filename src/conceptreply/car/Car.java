package conceptreply.car;

/**
 *
 * @author kyaprakci
 */
public class Car {
    private final int carId;
    private final CarModel carModel;
    private final EngineType engineType;
    private CarInfotainmentSystem carInfotainmentSystem;
    private CarInteriorDesign carInteriorDesign;
    private Location carLocation;
    
    private Car(){
        this.carId = -1;
        this.carModel = null;
        this.engineType = null;
        this.carInfotainmentSystem = null;
        this.carInteriorDesign = null;
        this.carLocation = null;
    }
    
    public Car(int carId, CarModel carModel, EngineType engineType, CarInfotainmentSystem carInfotainmentSystem, CarInteriorDesign carInteriorDesign, Location carLocation){
        this.carId = carId;
        this.carModel = carModel;
        this.engineType = engineType;
        this.carInfotainmentSystem = carInfotainmentSystem;
        this.carInteriorDesign = carInteriorDesign;
        this.carLocation = carLocation;
    }
    
    public int getCarId(){
        return this.carId;
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
    
    public Location getCarLocation(){
        return this.carLocation;
    }
    
    public void setCarInfotainmentSystem(CarInfotainmentSystem carInfotainmentSystem){
        this.carInfotainmentSystem = carInfotainmentSystem;
    }
    
    public void setCarInteriorDesign(CarInteriorDesign carInteriorDesign){
        this.carInteriorDesign = carInteriorDesign;
    }
    
    public void setCarLocation(Location location){
        this.carLocation = location;
    }
}
