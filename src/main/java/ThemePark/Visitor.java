package ThemePark;

public class Visitor {

    private String name;
    private int age;
    private int height;
    private int wallet;

    public Visitor(String name, int age, int height, int wallet){
        this.name = name;
        this.age = age;
        this.height = height;
        this.wallet = wallet;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWallet() {
        return this.wallet;
    }
}
