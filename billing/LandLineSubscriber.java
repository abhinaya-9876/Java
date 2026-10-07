package billing;

public class LandLineSubscriber extends Subscriber {

    private int noOfSTDCallMinutes;
    private double costPerEachSTDMinute;

    public LandLineSubscriber(String subscriberName, long subscriberId,
            long subscriberPhoneNumber, String subscriberPlanName,
            int subscriberFreeCalls, double subscriberPackageCost,
            int subscriberExtraCallsInMinutes,
            double subscriberExtraCallCostPerMinutes,
            int noOfSTDCallMinutes,
            double costPerEachSTDMinute) {

        super(subscriberName, subscriberId, subscriberPhoneNumber,
                subscriberPlanName, subscriberFreeCalls,
                subscriberPackageCost,
                subscriberExtraCallsInMinutes,
                subscriberExtraCallCostPerMinutes);

        this.noOfSTDCallMinutes = noOfSTDCallMinutes;
        this.costPerEachSTDMinute = costPerEachSTDMinute;
    }

    @Override
    public void getSubscriberDetails() {

        System.out.println("\n========== LANDLINE SUBSCRIBER ==========");

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
        System.out.println("STD Call Minutes   : " + noOfSTDCallMinutes);
        System.out.println("STD Rate           : Rs. "
                + costPerEachSTDMinute);
    }

    public double calculateBill() {

        double extraCallCharge =
                subscriberExtraCallsInMinutes
                * subscriberExtraCallCostPerMinutes;

        double stdCallCharge =
                noOfSTDCallMinutes
                * costPerEachSTDMinute;

        double subtotal =
                subscriberPackageCost
                + extraCallCharge
                + stdCallCharge;

        double tax =
                subtotal * subscriberTaxOnBill / 100;

        double totalBill = subtotal + tax;

        return totalBill;
    }

    public void printBill() {

        double extraCallCharge =
                subscriberExtraCallsInMinutes
                * subscriberExtraCallCostPerMinutes;

        double stdCallCharge =
                noOfSTDCallMinutes
                * costPerEachSTDMinute;

        double subtotal =
                subscriberPackageCost
                + extraCallCharge
                + stdCallCharge;

        double tax =
                subtotal * subscriberTaxOnBill / 100;

        double totalBill = subtotal + tax;

        System.out.println("\n========================================");
        System.out.println("          LANDLINE BILL");
        System.out.println("========================================");

        System.out.println("Subscriber Name : " + subscriberName);
        System.out.println("Phone Number    : " + subscriberPhoneNumber);

        System.out.println("----------------------------------------");

        System.out.printf("Package Cost      : Rs. %.2f%n",
                subscriberPackageCost);

        System.out.printf("Extra Call Charge : Rs. %.2f%n",
                extraCallCharge);

        System.out.printf("STD Call Charge   : Rs. %.2f%n",
                stdCallCharge);

        System.out.printf("Subtotal          : Rs. %.2f%n",
                subtotal);

        System.out.printf("Tax (10%%)         : Rs. %.2f%n",
                tax);

        System.out.println("----------------------------------------");

        System.out.printf("TOTAL BILL        : Rs. %.2f%n",
                totalBill);

        System.out.println("========================================");
    }
}