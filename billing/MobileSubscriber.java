package billing;

public class MobileSubscriber extends Subscriber {

    private int roamingNoOfMinutes;
    private double roamingCostPerMinute;

    public MobileSubscriber(String subscriberName, long subscriberId,
            long subscriberPhoneNumber, String subscriberPlanName,
            int subscriberFreeCalls, double subscriberPackageCost,
            int subscriberExtraCallsInMinutes,
            double subscriberExtraCallCostPerMinutes,
            int roamingNoOfMinutes,
            double roamingCostPerMinute) {

        super(subscriberName, subscriberId, subscriberPhoneNumber,
                subscriberPlanName, subscriberFreeCalls,
                subscriberPackageCost,
                subscriberExtraCallsInMinutes,
                subscriberExtraCallCostPerMinutes);

        this.roamingNoOfMinutes = roamingNoOfMinutes;
        this.roamingCostPerMinute = roamingCostPerMinute;
    }

  
    public void getSubscriberDetails() {

        System.out.println("\n========== MOBILE SUBSCRIBER ==========");

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
        System.out.println("Roaming Minutes    : " + roamingNoOfMinutes);
        System.out.println("Roaming Rate       : Rs. "
                + roamingCostPerMinute);
    }

    public double calculateBill() {

        double extraCallCharge =
                subscriberExtraCallsInMinutes
                * subscriberExtraCallCostPerMinutes;

        double roamingCharge =
                roamingNoOfMinutes
                * roamingCostPerMinute;

        double subtotal =
                subscriberPackageCost
                + extraCallCharge
                + roamingCharge;

        double tax =
                subtotal * subscriberTaxOnBill / 100;

        double totalBill = subtotal + tax;

        return totalBill;
    }

    public void printBill() {

        double extraCallCharge =
                subscriberExtraCallsInMinutes
                * subscriberExtraCallCostPerMinutes;

        double roamingCharge =
                roamingNoOfMinutes
                * roamingCostPerMinute;

        double subtotal =
                subscriberPackageCost
                + extraCallCharge
                + roamingCharge;

        double tax =
                subtotal * subscriberTaxOnBill / 100;

        double totalBill = subtotal + tax;

        System.out.println("\n========================================");
        System.out.println("          MOBILE BILL");
        System.out.println("========================================");

        System.out.println("Subscriber Name : " + subscriberName);
        System.out.println("Phone Number    : " + subscriberPhoneNumber);

        System.out.println("----------------------------------------");

        System.out.printf("Package Cost      : Rs. %.2f%n",
                subscriberPackageCost);

        System.out.printf("Extra Call Charge : Rs. %.2f%n",
                extraCallCharge);

        System.out.printf("Roaming Charge    : Rs. %.2f%n",
                roamingCharge);

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