package Stalls;

import ThemePark.ISecurity;
import ThemePark.Visitor;

public class TabaccoStall extends Stall implements ISecurity {

    private int minAge;

    public TabaccoStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
        this.minAge = 18;
    }

    public int getMinAge(){
        return this.minAge;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= this.minAge){
            return true;
        }
        return false;
    }
}
