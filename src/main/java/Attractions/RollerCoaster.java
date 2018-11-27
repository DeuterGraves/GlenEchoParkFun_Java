package Attractions;

public class RollerCoaster extends Attraction{

    private int minHeight;

    public RollerCoaster(String name, int minHeight){
        super(name);
        this.minHeight = minHeight;
    }

    public int getMinHeight(){
        return this.minHeight;
    }



}
