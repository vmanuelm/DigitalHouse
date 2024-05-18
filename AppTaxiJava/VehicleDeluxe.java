public class VehicleDeluxe extends Vehicle{

    public Double priceMultiplier; 

    public VehicleDeluxe(String licencePlate, String color, Double priceMultiplier){
        super(licencePlate, color); 
        this.priceMultiplier = priceMultiplier; 
    }
    
    @Override
    public Double calculateFare(Double distanceInKilometers){
        return super.calculateFare(distanceInKilometers)*priceMultiplier;
    }
}
