package conceptreply.Manager;

import conceptreply.car.Car;
import conceptreply.car.CarInfotainmentSystem;
import conceptreply.car.CarInteriorDesign;
import conceptreply.car.CarModel;
import conceptreply.car.EngineType;
import conceptreply.car.Location;
import conceptreply.demand.Demand;
import conceptreply.user.DriverLicence;
import conceptreply.user.User;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kyaprakci
 */
public class ManagementService {
    
    private static final ManagementService MANAGEMENT_SERVICE = new ManagementService();
    
    private final Map<Integer, Car> carDatabase = new HashMap<>();
    private final Map<Integer, User> userDatabase = new HashMap<>();
    private final Map<Integer, Demand> demandDatabase = new HashMap<>();
    
    
    private ManagementService(){
    }
    
    public static ManagementService create(){
        return MANAGEMENT_SERVICE;
    }
    
    public void addCar(Car car){
        if(car == null){
            throw new IllegalArgumentException("Input car is null!");
        }else if(carDatabase.containsKey(car.getCarId())){
            //todo: show message that car already exists
        }else{
            carDatabase.put(car.getCarId(), car);
        }
    }
    
    public void removeCar(Car car){
        if(car == null){
            throw new IllegalArgumentException("Input car is null!");
        }else if(carDatabase.containsKey(car.getCarId())){
            carDatabase.remove(car.getCarId());
        }else{
            //todo: show message that car does not exist
        }
    }
    
    public void modifyCar(Car carToModify, CarInfotainmentSystem carInfotainmentSystemToSet, CarInteriorDesign carInteriorDesignToSet){
        if(carToModify == null){
            throw new IllegalArgumentException("Input car is null!");
        }else if(carDatabase.containsKey(carToModify.getCarId())){
            carDatabase.get(carToModify.getCarId()).setCarInfotainmentSystem(carInfotainmentSystemToSet);
            carDatabase.get(carToModify.getCarId()).setCarInteriorDesign(carInteriorDesignToSet);
        }else{
            //todo: show message that car does not exist
        }
    }
    
    public void updateCarLocation(Car carToModify, Location locationToSet){
        if(carToModify == null){
            throw new IllegalArgumentException("Input car is null!");
        }else if(carDatabase.containsKey(carToModify.getCarId())){
            carDatabase.get(carToModify.getCarId()).setCarLocation(locationToSet);
        }else{
            //todo: show message that car does not exist
        }
    }
    
    public void addUser(User userToAdd){
        if(userToAdd == null){
            throw new IllegalArgumentException("Input user is null!");
        }else if(userDatabase.containsKey(userToAdd.getNationalityNumber())){
            //todo: show message that user already exists
        }else{
            userDatabase.put(userToAdd.getNationalityNumber(), userToAdd);
        }
    }
    
    public void removeUser(User userToRemove){
        if(userToRemove == null){
            throw new IllegalArgumentException("Input user is null!");
        }else if(userDatabase.containsKey(userToRemove.getNationalityNumber())){
            
            //todo: check the user has some bookings, do not allow if there is
            userDatabase.remove(userToRemove.getNationalityNumber());
        }else{
            //todo: show message that user does not exist
        }
    }
    
    public void modifyUser(User userToModify, int age, DriverLicence driverLicence){
        if(userToModify == null){
            throw new IllegalArgumentException("Input user is null!");
        }else if(userDatabase.containsKey(userToModify.getNationalityNumber())){
            userDatabase.get(userToModify.getNationalityNumber()).setAge(age);
            userDatabase.get(userToModify.getNationalityNumber()).setDriverLicence(driverLicence);
        }else{
            //todo: show message that user does not exist
        }
    }
    
    public void addDemand(Demand demand){
        if(demand == null){
            throw new IllegalArgumentException("Input demand is null!");
        }else if(demandDatabase.containsKey(demand.getDemandId())){
            //todo: show message that demand already exists
        }else{
            User user = demand.getDemandingUser();
            if(userDatabase.containsKey(user.getNationalityNumber())){
                demandDatabase.put(demand.getDemandId(), demand);
            }else{
                ////todo: show message that user does not exist
            }
        }
    }
    
    public void removeDemand(Demand demandToRemove){
        if(demandToRemove == null){
            throw new IllegalArgumentException("Input demand is null!");
        }else if(demandDatabase.containsKey(demandToRemove.getDemandId())){
            demandDatabase.remove(demandToRemove.getDemandId());
        }else{
            //todo: show message that demand does not exist
        }
    }
    
    public void modifyDemand(Demand demandToModify, Location pickUpLoc, Location dropOffLoc, Date earliestPickUpDate, Date latestDropOffDate, CarModel carModel, EngineType engineType, CarInfotainmentSystem carInfotainmentSystem, CarInteriorDesign carInteriorDesign){
        if(demandToModify == null){
            throw new IllegalArgumentException("Input demand is null!");
        }else if(demandDatabase.containsKey(demandToModify.getDemandId())){
            Demand d = demandDatabase.get(demandToModify.getDemandId());
            d.setCarInfotainmentSystem(carInfotainmentSystem);
            d.setCarInteriorDesign(carInteriorDesign);
            d.setCarModel(carModel);
            d.setDropOffLocation(dropOffLoc);
            d.setPickUpLocation(pickUpLoc);
            d.setEarliestPickUpDate(earliestPickUpDate);
            d.setLatestDropOffDate(latestDropOffDate);
            d.setEngineType(engineType);
        }else{
            //todo: show message that demand does not exist
        }
    }
}
