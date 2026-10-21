package proglabweek5;

public class TwoDayPackage extends Package {
    public double flatFee = 2.5;

    public TwoDayPackage(String senderName, String receiverName, String senderAddress, String receiverAddress, String senderCity, String receiverCity, String senderState, String receiverState, String zCodeSender, String zCodeReceiver, double packageWeight, double costPerOunce, double flatFee) {
        super(senderName, receiverName, senderAddress, receiverAddress, senderCity, receiverCity, senderState, receiverState, zCodeSender, zCodeReceiver, packageWeight, costPerOunce);
        this.flatFee = flatFee;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + flatFee;
    }
}