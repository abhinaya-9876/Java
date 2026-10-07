package billing;

import java.util.Scanner;

public class BillGenerationApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("     TELECOM BILL GENERATION SYSTEM");
        System.out.println("========================================");

        System.out.println("\nSelect Subscriber Type");
        System.out.println("1. Mobile Subscriber");
        System.out.println("2. Landline Subscriber");

        System.out.print("\nEnter your choice: ");
        int choice = scanner.nextInt();

        scanner.nextLine();

        if (choice == 1) {

            System.out.println("\n--- MOBILE SUBSCRIBER DETAILS ---");

            System.out.print("Enter Subscriber Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Subscriber ID: ");
            long id = scanner.nextLong();

            System.out.print("Enter Phone Number: ");
            long phone = scanner.nextLong();

            scanner.nextLine();

            System.out.print("Enter Plan Name: ");
            String plan = scanner.nextLine();

            System.out.print("Enter Free Calls/Minutes: ");
            int freeCalls = scanner.nextInt();

            System.out.print("Enter Package Cost: ");
            double packageCost = scanner.nextDouble();

            System.out.print("Enter Extra Call Minutes: ");
            int extraMinutes = scanner.nextInt();

            System.out.print("Enter Extra Call Cost Per Minute: ");
            double extraRate = scanner.nextDouble();

            System.out.print("Enter Roaming Minutes: ");
            int roamingMinutes = scanner.nextInt();

            System.out.print("Enter Roaming Cost Per Minute: ");
            double roamingRate = scanner.nextDouble();

            MobileSubscriber mobile =
                    new MobileSubscriber(
                            name,
                            id,
                            phone,
                            plan,
                            freeCalls,
                            packageCost,
                            extraMinutes,
                            extraRate,
                            roamingMinutes,
                            roamingRate
                    );

            mobile.getSubscriberDetails();

            System.out.println("\nGenerating mobile bill...");

            mobile.printBill();

        } else if (choice == 2) {

            System.out.println("\n--- LANDLINE SUBSCRIBER DETAILS ---");

            System.out.print("Enter Subscriber Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Subscriber ID: ");
            long id = scanner.nextLong();

            System.out.print("Enter Phone Number: ");
            long phone = scanner.nextLong();

            scanner.nextLine();

            System.out.print("Enter Plan Name: ");
            String plan = scanner.nextLine();

            System.out.print("Enter Free Calls/Minutes: ");
            int freeCalls = scanner.nextInt();

            System.out.print("Enter Package Cost: ");
            double packageCost = scanner.nextDouble();

            System.out.print("Enter Extra Call Minutes: ");
            int extraMinutes = scanner.nextInt();

            System.out.print("Enter Extra Call Cost Per Minute: ");
            double extraRate = scanner.nextDouble();

            System.out.print("Enter STD Call Minutes: ");
            int stdMinutes = scanner.nextInt();

            System.out.print("Enter STD Cost Per Minute: ");
            double stdRate = scanner.nextDouble();

            LandLineSubscriber landline =
                    new LandLineSubscriber(
                            name,
                            id,
                            phone,
                            plan,
                            freeCalls,
                            packageCost,
                            extraMinutes,
                            extraRate,
                            stdMinutes,
                            stdRate
                    );

            landline.getSubscriberDetails();

            System.out.println("\nGenerating landline bill...");

            landline.printBill();

        } else {

            System.out.println("\nInvalid choice!");
            System.out.println("Please select either 1 or 2.");

        }

        System.out.println("\nThank you for using Telecom Bill Generation System.");

        scanner.close();
    }
}