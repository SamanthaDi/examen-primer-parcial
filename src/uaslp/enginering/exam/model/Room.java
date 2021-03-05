package uaslp.enginering.exam.model;


public class Room {

    private int Number;
    private String Description;
    private RoomStatus status;

    public Room(int number, String description, RoomStatus status){
        this.status = status;
        this.Number = number;
        this.Description = description;
    }


    public int getNumber() { return Number;}

    public void setNumber(int number) {
        this.Number = number;
    }

    public String getDescription() { return Description;}

    public void setDescription(String description) {
        this.Description = description;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }
}
