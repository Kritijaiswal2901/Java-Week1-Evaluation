// Vehicle.java
public class Vehicle {
    private String licenseNumber;
    private String vehicleType;

    public Vehicle(String licenseNumber, String vehicleType) {
        this.licenseNumber = licenseNumber;
        this.vehicleType = vehicleType;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getType() {
        return vehicleType;
    }
}

