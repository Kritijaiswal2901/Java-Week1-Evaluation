import java.util.Scanner;

public class ParkingManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of parking spaces in the lot: ");
        int numSpaces = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        ParkingLot parkingLot = new ParkingLot(numSpaces);

        System.out.println("Enter attendant name: ");
        String attendantName = scanner.nextLine();
        Attendant attendant = new Attendant(attendantName);

        // Test parking a vehicle
        System.out.println("Test Case 1: Park a vehicle");
        System.out.println("Enter parking space number to park the vehicle: ");
        int spaceNumber1 = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.println("Enter vehicle license number: ");
        String licenseNumber1 = scanner.nextLine();

        System.out.println("Enter vehicle type: ");
        String vehicleType1 = scanner.nextLine();

        Vehicle vehicle1 = new Vehicle(licenseNumber1, vehicleType1);
        ParkingSpace parkingSpace1 = parkingLot.getParkingSpaces().get(spaceNumber1 - 1);

        attendant.parkVehicle(parkingSpace1, vehicle1);

        // Test unparking a vehicle
        System.out.println("Test Case 2: Unpark a vehicle");
        System.out.println("Enter parking space number to unpark the vehicle: ");
        int spaceNumber2 = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        ParkingSpace parkingSpace2 = parkingLot.getParkingSpaces().get(spaceNumber2 - 1);
        attendant.vacantParkingSpace(parkingSpace2);

        // Test checking parking space status
        System.out.println("Test Case 3: Check parking space status");
        System.out.println("Enter parking space number to check status: ");
        int spaceNumber3 = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        ParkingSpace parkingSpace3 = parkingLot.getParkingSpaces().get(spaceNumber3 - 1);
        System.out.println("Parking space " + spaceNumber3 + " is occupied: " + parkingSpace3.isOccupied());

        scanner.close();
    }
}

    