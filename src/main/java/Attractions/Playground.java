package Attractions;

import Interfaces.ISecurity;
import ThemePark.Visitor;

public class Playground extends Attraction implements ISecurity {

    private int maxAge;

    public Playground(String name, int rating){
        super(name, rating);
        this.maxAge = 15;
    }

    public int getMaxAge(){
        return this.maxAge;
    }


    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < this.maxAge){
            return true;
        }
        return false;
    }

}
