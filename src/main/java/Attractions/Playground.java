package Attractions;

public class Playground extends Attraction {

    private int maxAge;

    public Playground(String name, int maxAge){
        super(name);
        this.maxAge = maxAge;
    }

    public int getMaxAge(){
        return this.maxAge;
    }


}
