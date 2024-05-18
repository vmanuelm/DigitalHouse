public abstract class Vehicle {

    private static Double PRICE_PER_KILOMETER = 100.0;
    private String licencePlate; 
    private String color; 
    
    public Vehicle(String licencePlate, String color){
        this.licencePlate = licencePlate; 
        this.color = color; 
    }
    
    public Double calculateFare(Double distanceInKilometers){
        return distanceInKilometers * PRICE_PER_KILOMETER;

    }
}
