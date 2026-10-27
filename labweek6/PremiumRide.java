package proglabweek6;

public class PremiumRide extends Ride{
    private double comfortFee;
    private double surgeMultiplier;
 
    public PremiumRide(double comfortFee, double surgeMultiplier, String passangerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        super(passangerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.comfortFee = comfortFee;
        if(surgeMultiplier > 3 || surgeMultiplier < 1 ){
            System.out.println(passangerName +" ın sürüşü mutliplier 3 le 1 arasında olmalı 1 olarak ayarlandı");
            this.surgeMultiplier = 1;
        }
        else{
            this.surgeMultiplier = surgeMultiplier;
        }
    }
 
 
    @Override
    public double calculateFare(){
 
        return (super.calculateFare() + comfortFee)*surgeMultiplier;
 
    }
 
 
    @Override
    public String toString(){
        return super.toString() +" Base ücret "+"\n"+"PremiumRide ücret "+calculateFare()+"\n"+"PremiumRide";
    }
}
