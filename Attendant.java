import java.util.Scanner;

public class Attendant {
    private String name;
    public Attendant(String name) {
        this.name = name;
    }
    public String getname() {
        return name;
    }

    public void parkVehicle(ParkingSpace parkingSpace, Vehicle vehicle) {
        if (!parkingSpace.isOccupied()) {
            parkingSpace.parkVehicle(vehicle);
        } else {
            System.out.println("Parking space " + parkingSpace.getSpaceNumber() + " is occupied.");
        }
    }
    public void vacantParkingSpace(ParkingSpace parkingSpace) {
        parkingSpace.unParkVehicle();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter attendant name: ");
        String attendantName = scanner.nextLine();
        Attendant attendant = new Attendant(attendantName);

        System.out.println("Enter parking space number to park the vehicle: ");
        int spaceNumber = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.println("Enter vehicle license number: ");
        String licenseNumber = scanner.nextLine();

        System.out.println("Enter vehicle type: ");
        String vehicleType = scanner.nextLine();

        Vehicle vehicle = new Vehicle(licenseNumber, vehicleType);
        ParkingSpace parkingSpace = new ParkingSpace(spaceNumber);

        attendant.parkVehicle(parkingSpace, vehicle);

        // You can add more user interactions here as needed

        scanner.close();
    }
}

