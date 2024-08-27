import java.util.Scanner;
public class IT24102459_Lab5Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start date (1 - 31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter the end date (1 - 31): ");
        int endDate = scanner.nextInt();
        
        if (startDate < 1) {
            System.out.println("Error: Start date must be between 1 and 31.");
        }
        
        if (startDate > 31) {
            System.out.println("Error: Start date must be between 1 and 31.");
        }

        if (endDate < 1) {
            System.out.println("Error: End date must be between 1 and 31.");
        }

        if (endDate > 31) {
            System.out.println("Error: End date must be between 1 and 31.");
        }
        
        if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than the end date.");
        }
        
        int numberOfDays = endDate - startDate;
        
        double discountRate = 0.0;
        if (numberOfDays >= 3) {
            if (numberOfDays <= 4) {
                discountRate = 10.0;  
            } else {
                discountRate = 20.0;  
            }
        }
        
        double roomChargePerDay = 48000.0;
        double totalAmount = numberOfDays * roomChargePerDay;
        double discountAmount = totalAmount * (discountRate / 100);
        double finalAmount = totalAmount - discountAmount;
        
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Discount rate: " + discountRate + "%");
        System.out.println("Total amount to be paid: Rs " + finalAmount);

    }
}
