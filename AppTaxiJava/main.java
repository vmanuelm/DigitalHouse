public class main{

    public static void main(String[] args){

        Vehicle vehicleStandar = new VehicleStandar("1234", "red");
        Vehicle vehicleDeluxe = new VehicleDeluxe("5678", "blue", 3.0);

        Driver driver = new Driver("Manuel", vehicleStandar);

        driver.howMuchForTheTrip(10.0);
        driver.howMuchForTheTrip(66.0);

        driver.setVehicle(vehicleDeluxe);
        driver.howMuchForTheTrip(30.0);




    }
}