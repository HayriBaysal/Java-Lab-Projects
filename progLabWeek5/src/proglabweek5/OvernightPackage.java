package proglabweek5;

public class OvernightPackage extends Package {
    public double additionalFee = 1.25;

    public OvernightPackage(String senderName, String receiverName, String senderAddress, String receiverAddress, String senderCity, String receiverCity, String senderState, String receiverState, String zCodeSender, String zCodeReceiver, double packageWeight, double costPerOunce, double additionalFee) {
        super(senderName, receiverName, senderAddress, receiverAddress, senderCity, receiverCity, senderState, receiverState, zCodeSender, zCodeReceiver, packageWeight, costPerOunce);
        this.additionalFee = additionalFee;
    }

    @Override
    public double calculateCost() {
        return (additionalFee + costPerOunce) * packageWeight;
    }
}