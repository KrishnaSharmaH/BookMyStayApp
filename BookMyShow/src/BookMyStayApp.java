/**
 * ABSTRACT CLASS Room
 * Use Case 2: Basic Room Types & Static Availability
 * @version 2.1
 */
abstract class Room {

    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;

    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Room Size: " + squareFeet + " sq ft");
        System.out.println("Price Per Night: ₹" + pricePerNight);
        System.out.println("----------------------------");
    }
}

/**
 * CLASS SingleRoom
 * Represents a single room in the hotel.
 * @version 2.1
 */
class SingleRoom extends Room {

    public SingleRoom() {
        super(1, 250, 1500.0);
    }
}

/**
 * CLASS DoubleRoom
 * Represents a double room in the hotel.
 * @version 2.1
 */
class DoubleRoom extends Room {

    public DoubleRoom() {
        super(2, 400, 2500.0);
    }
}

/**
 * CLASS SuiteRoom
 * Represents a suite room in the hotel.
 * @version 2.1
 */
class SuiteRoom extends Room {

    public SuiteRoom() {
        super(3, 750, 5000.0);
    }
}

/**
 * MAIN CLASS
 * Use Case 2: Basic Room Types & Static Availability
 * @version 2.1
 */
public class BookMyStayApp {

    public static void main(String[] args) {

        // Creating room objects
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Simple availability variables
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("----- SINGLE ROOM -----");
        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailable);

        System.out.println("\n----- DOUBLE ROOM -----");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable);

        System.out.println("\n----- SUITE ROOM -----");
        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}