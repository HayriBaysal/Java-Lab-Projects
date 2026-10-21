package proglabweek5;

public class Package {
    protected String senderName;
    protected String receiverName;

    protected String senderAddress;
    protected String receiverAddress;

    protected String senderCity;
    protected String receiverCity;

    protected String senderState;
    protected String receiverState;

    protected String zCodeSender;
    protected String zCodeReceiver;

    protected double packageWeight;
    protected double costPerOunce;

    public Package(String senderName, String receiverName, String senderAddress, String receiverAddress, String senderCity, String receiverCity, String senderState, String receiverState, String zCodeSender, String zCodeReceiver, double packageWeight, double costPerOunce) {
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.senderAddress = senderAddress;
        this.receiverAddress = receiverAddress;
        this.senderCity = senderCity;
        this.receiverCity = receiverCity;
        this.senderState = senderState;
        this.receiverState = receiverState;
        this.zCodeSender = zCodeSender;
        this.zCodeReceiver = zCodeReceiver;

        if (packageWeight <= 0) {
            throw new IllegalArgumentException("ağırlık negatif olmaz");
        } else {
            this.packageWeight = packageWeight;
        }

        if (costPerOunce <= 0) {
            throw new IllegalArgumentException("ağırlık negatif olmaz");
        } else {
            this.costPerOunce = costPerOunce;
        }
    }

    public double calculateCost() {
        return packageWeight * costPerOunce;
    }

    public void yazı() {
        System.out.println(senderName + " TO " + receiverName);
        System.out.println("Sender Address " + senderAddress);
        System.out.println("Receiver Address " + receiverAddress);
        System.out.println("State of sender " + senderState);
        System.out.println("State of receiver" + receiverState);
        System.out.println("ZIP code for sender " + zCodeSender);
        System.out.println("ZIP code for receiver" + zCodeReceiver);
        System.out.println("Cost " + calculateCost());
    }
}