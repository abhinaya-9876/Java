package billing;

public class Subscriber {

    protected String subscriberName;
    protected long subscriberId;
    protected long subscriberPhoneNumber;
    protected String subscriberPlanName;
    protected int subscriberFreeCalls;
    protected double subscriberPackageCost;
    protected int subscriberExtraCallsInMinutes;
    protected double subscriberExtraCallCostPerMinutes;
    protected double subscriberTaxOnBill;

    public Subscriber(String subscriberName, long subscriberId,
            long subscriberPhoneNumber, String subscriberPlanName,
            int subscriberFreeCalls, double subscriberPackageCost,
            int subscriberExtraCallsInMinutes,
            double subscriberExtraCallCostPerMinutes) {

        this.subscriberName = subscriberName;
        this.subscriberId = subscriberId;
        this.subscriberPhoneNumber = subscriberPhoneNumber;
        this.subscriberPlanName = subscriberPlanName;
        this.subscriberFreeCalls = subscriberFreeCalls;
        this.subscriberPackageCost = subscriberPackageCost;
        this.subscriberExtraCallsInMinutes = subscriberExtraCallsInMinutes;
        this.subscriberExtraCallCostPerMinutes =
                subscriberExtraCallCostPerMinutes;

        // Tax is 10%
        this.subscriberTaxOnBill = 10.0;
    }

    public void getSubscriberDetails() {

        System.out.println("\n========== SUBSCRIBER DETAILS ==========");

        System.out.println("Subscriber Name    : " + subscriberName);
        System.out.println("Subscriber ID      : " + subscriberId);
        System.out.println("Phone Number       : " + subscriberPhoneNumber);
        System.out.println("Plan Name          : " + subscriberPlanName);
        System.out.println("Free Calls/Minutes : " + subscriberFreeCalls);
        System.out.println("Package Cost       : Rs. " + subscriberPackageCost);
        System.out.println("Extra Call Minutes : "
                + subscriberExtraCallsInMinutes);
        System.out.println("Extra Call Rate    : Rs. "
                + subscriberExtraCallCostPerMinutes);
    }
}