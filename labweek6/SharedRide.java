package proglabweek6;


public class SharedRide extends EconomyRide {
    private int passengerCount;
 
    public SharedRide(int passengerCount, double pricePerMinute, String passangerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        super(pricePerMinute, passangerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        if(passengerCount < 1 || passengerCount > 4){
            System.out.println(passangerName + " ın sürüşü passengerCount 1 ve 4 arasında olmalı 1 olarak ayarlandı");
            this.passengerCount = 1;
        }
        else{
            this.passengerCount = passengerCount;
        }
    }
 
 
    @Override
    public double calculateFare(){
 
        return (super.calculateFare() / passengerCount) + super.calculateFare() /10;
 
    }
 
 
    @Override
    public String toString(){
        return super.toString() +" EconomyRide ücret "+"\n"+"SharedRide ücret "+calculateFare()+"\n"+"SharedRide";
    }
}
