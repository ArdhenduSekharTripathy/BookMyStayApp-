import java.util.HashMap;
import java.util.Map;

class RoomInventory {

    private HashMap<String, Integer> rooms;

    RoomInventory() {
        rooms = new HashMap<>();
        rooms.put("Single Room", 5);
        rooms.put("Double Room", 3);
        rooms.put("Suite Room", 2);
    }

    int getAvailability(String type) {
        return rooms.getOrDefault(type, 0);
    }

    Map<String, Integer> getAllAvailability() {
        return new HashMap<>(rooms); // return a copy to prevent modification
    }
}

abstract class Room {

    String roomType;
    int beds;
    int size;
    double price;

    Room(String roomType, int beds, int size, double price) {
        this.roomType = roomType;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    void displayRoom() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sq ft");
        System.out.println("Price: $" + price);
    }
}

class SingleRoom extends Room {

    SingleRoom() {
        super("Single Room", 1, 200, 100);
    }
}

class DoubleRoom extends Room {

    DoubleRoom() {
        super("Double Room", 2, 350, 180);
    }
}

class SuiteRoom extends Room {

    SuiteRoom() {
        super("Suite Room", 3, 500, 300);
    }
}

public class UseCase4RoomSearch{

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        Room[] rooms = { new SingleRoom(), new DoubleRoom(), new SuiteRoom() };

        System.out.println("Book My Stay - Room Search v4.0");
        System.out.println("--------------------------------");

        for (Room room : rooms) {
            if (inventory.getAvailability(room.roomType) > 0) {
                room.displayRoom();
                System.out.println("Available: " + inventory.getAvailability(room.roomType));
                System.out.println();
            }
        }
    }
}