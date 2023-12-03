import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpace> parkingSpaces;

    public ParkingLot(int NoOfspaces) {
        parkingSpaces = new ArrayList<>();
        for (int i = 1; i <= NoOfspaces; i++) {
            parkingSpaces.add(new ParkingSpace(i));
        }
    }

    public List<ParkingSpace> getParkingSpaces() {
        return parkingSpaces;
    }
}

