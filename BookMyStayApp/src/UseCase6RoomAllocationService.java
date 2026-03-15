import java.util.LinkedList;
import java.util.Queue;

class Reservation {

    String guestName;
    String roomType;

    Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    void displayReservation() {
        System.out.println("Guest: " + guestName + " | Requested Room: " + roomType);
    }
}

public class UseCase5BookingRequestQueue {

    public static void main(String[] args) {

        Queue<Reservation> bookingQueue = new LinkedList<>();

        // Simulating booking requests
        bookingQueue.add(new Reservation("Alice", "Single Room"));
        bookingQueue.add(new Reservation("Bob", "Double Room"));
        bookingQueue.add(new Reservation("Charlie", "Suite Room"));
        bookingQueue.add(new Reservation("Diana", "Single Room"));

        System.out.println("Book My Stay - Booking Request Queue v5.0");
        System.out.println("-----------------------------------------");

        System.out.println("Current Booking Requests (FIFO Order):");
        for (Reservation request : bookingQueue) {
            request.displayReservation();
        }
    }
}