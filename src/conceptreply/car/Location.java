package conceptreply.car;

/**
 *
 * @author kyaprakci
 */
public class Location {
    private double lat_deg;
    private double lon_deg;
    
    public Location(double lat_deg, double lon_deg){
        this.lat_deg = lat_deg;
        this.lon_deg = lon_deg;
    }
    
    public double getLat_deg(){
        return this.lat_deg;
    }
    
    public double getLon_deg(){
        return this.lon_deg;
    }
    
    public void setLat_deg(double lat_deg){
        this.lat_deg = lat_deg;
    }
    
    public void setLon_deg(double lon_deg){
        this.lon_deg = lon_deg;
    }
}
