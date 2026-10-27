package proglabweek6;


public class EconomyRide extends Ride {
    private double pricePerMinute;
 
    public EconomyRide(double pricePerMinute, String passangerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        super(passangerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.pricePerMinute = pricePerMinute;
    }
 
    @Override
    public double calculateFare(){
 
        double a = 50;
        if(super.calculateFare()+ super.getDurationMin()*pricePerMinute < 50){
            return a;
        }
 
        else{
            a = super.calculateFare()+ super.getDurationMin()*pricePerMinute;
            return a;
        }
 
    }
 
 
    @Override
    public String toString(){
        return super.toString() +" Base ücret "+"\n"+"EconomyRide ücret "+calculateFare()+"\n"+"EconomyRide";
    }
 
}
