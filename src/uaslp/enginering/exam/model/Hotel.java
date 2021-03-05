package uaslp.enginering.exam.model;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> reservations;
    private ArrayList<Room> rooms;
    private String name;

    public Hotel(String name) {
        reservations = new ArrayList<>();
        rooms = new ArrayList<>();
        this.name = name;
    }

    public ArrayList<Room> getRooms() { return rooms;}

    public void setRooms(ArrayList<Room> rooms) { this.rooms = rooms;}

    public String getName() { return name;}

    public void setName(String name) { this.name = name;}



    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }

    public void addRoom(Room room){ rooms.add(room); }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
}
