package Stalls;

public abstract class Stall {

    protected String name;
    protected String ownerName;
    protected String parkingSpot;
    protected int rating;

    public Stall(String name, String ownerName, String parkingSpot, int rating){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public String getParkingSpot() {
        return this.parkingSpot;
    }

    public int getRating(){
        return this.rating;
    }
}
