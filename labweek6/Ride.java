package proglabweek6;


public class Ride {
    private String passangerName ;
    private String pickup;
    private String destination;
    private double distanceKm;
    private int durationMin;
    private double pricePerKm;
 
    public Ride(String passangerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        this.passangerName = passangerName;
        this.pickup = pickup;
        this.destination = destination;
 
        if(distanceKm < 0){
            System.out.println(passangerName +" ın sürüşünde distanceKm pozitif olmalı 1 olarak ayarlanıyor");
            this.distanceKm = 1;
        }
        else{
            this.distanceKm = distanceKm;
        }
        if(durationMin < 0){
            System.out.println(passangerName +" ın sürüşünde durationMin pozitif olmalı 1 olarak ayarlanıyor");
            this.durationMin = 1;
        }
        else{
            this.durationMin = durationMin;
        }
        if(pricePerKm < 0){
            System.out.println(passangerName +" ın sürüşünde pricePerKm pozitif olmalı 1 olarak ayarlanıyor");
            this.pricePerKm = 1;
        }
        else{
            this.pricePerKm = pricePerKm;
        }
 
    }
 
    public String getPassangerName() {
        return passangerName;
    }
 
    public String getPickup() {
        return pickup;
    }
 
    public String getDestination() {
        return destination;
    }
 
    public double getDistanceKm() {
        return distanceKm;
    }
 
    public int getDurationMin() {
        return durationMin;
    }
 
    public double getPricePerKm() {
        return pricePerKm;
    }
 
 
    public double calculateFare(){
        return distanceKm * pricePerKm;
    }
 
    @Override
    public String toString(){
        return passangerName +"\n"+ pickup +"\n"+ destination +"\n"+ "distance km = "+distanceKm +"\n"+"DurationMin = " +durationMin +"\n"+"pricePerKm = "+pricePerKm;
    }
 
 
    //getter oluştur
    //constructor
    //calculate Fare
    //hepsi poisitif olacak olmazsa warning yazısı gösterip negatif değerleri 1 olarak ata
    //distance km * price for km to stringi override edip bütün detayları yazdır
}
