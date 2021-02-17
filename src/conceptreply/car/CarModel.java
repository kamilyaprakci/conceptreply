package conceptreply.car;

/**
 *
 * @author kyaprakci
 */
public class CarModel {
    private final CarName carName;
    private final int modelYear;
    
    private CarModel(){
        this.carName = null;
        this.modelYear = -1;
    }
    
    public CarModel(CarName carName, int modelYear){
        this.carName = carName;
        this.modelYear = modelYear;
    }
    
    public CarName getCarName(){
        return this.carName;
    }
    
    public int getModelYear(){
        return this.modelYear;
    }
}
