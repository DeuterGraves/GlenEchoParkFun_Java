package Attractions;

import ThemePark.ISecurity;
import ThemePark.Visitor;

public class RollerCoaster extends Attraction implements ISecurity {

    private int minHeight;
    private int minAge;

    public RollerCoaster(String name, int rating){
        super(name, rating);
        this.minHeight = 145;
        this.minAge = 12;
    }

    public int getMinHeight(){
        return this.minHeight;
    }

    public int getMinAge(){
        return this.minAge;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if ((visitor.getHeight() >= this.minHeight) && (visitor.getAge() >= this.minAge)){
            return true;
        }
        return false;
    }
}
