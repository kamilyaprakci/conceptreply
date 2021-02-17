/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptreply.user;

/**
 *
 * @author kyaprakci
 */
public class User {
    private final int nationalityNumber;
    private final Gender gender;
    private final String name;
    private int age;
    private DriverLicence driverLicence;
    
    private User(){
        this.nationalityNumber = -1;
        this.gender = null;
        this.name = null;
        this.age = -1;
        this.driverLicence = DriverLicence.NO_LICENCE; 
    }
    
    public User(int nationalityNumber, Gender gender, String name, int age, DriverLicence driverLicence){
        this.nationalityNumber = nationalityNumber;
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.driverLicence = driverLicence; 
    }
    
    public int getNationalityNumber(){
        return this.nationalityNumber;
    }
    
    public Gender getGender(){
        return this.gender;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public DriverLicence getDriverLicence(){
        return this.driverLicence;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setDriverLicence(DriverLicence driverLicence){
        this.driverLicence = driverLicence;
    }
    
}
