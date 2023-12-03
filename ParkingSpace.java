public class ParkingSpace {
    private int spaceNumber;
    private boolean IsOccupied;
    private Vehicle ParkedVehicle;
    private long parkStartTime; 
    private static final double COST_PER_HOUR= 3.0;

    public ParkingSpace(int spaceNumber) {
        this.spaceNumber = spaceNumber;
        this.IsOccupied = false;
        this.ParkedVehicle = null;
        this.parkStartTime = System.currentTimeMillis(); 
    }
    public int getSpaceNumber() {
        return spaceNumber;
    }
    public boolean isOccupied() {
        return IsOccupied;
    }
    public Vehicle getParkedVehicle() {
        return ParkedVehicle;
    }
    public void parkVehicle(Vehicle vehicle) {
        if (!IsOccupied) {
            this.ParkedVehicle = vehicle;
            this.IsOccupied = true;
            System.out.println(vehicle.getType() + "  is parked space in  " + spaceNumber);
        } else {
            System.out.println("Parking space " + spaceNumber + " is already occupied.");
        }
    }
    public void unParkVehicle() {
        if (IsOccupied) {
            long parkEndTime = System.currentTimeMillis();
            double parkingDuration = (parkEndTime - parkStartTime) /(1000.0 * 60.0 * 60.0);
            double parkingFee = parkingDuration * COST_PER_HOUR;
            
            System.out.println(ParkedVehicle.getType() + " removed from space " + spaceNumber);
            System.out.println("Parking duration: " + parkingDuration + " hours");
            System.out.println("Parking fee: " + parkingFee + "  ruppes");

            this.ParkedVehicle = null;
            this.IsOccupied = false;
        } else {
            System.out.println("Parking space " + spaceNumber + " is already vacant.");
        }
    }
}
