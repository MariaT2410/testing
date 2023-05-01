package food;

public class Meat extends Food {


    public Meat(String name) {
        super(name);
    }

    public int getEnargy(){
        return (int) (Math.random() * 10);
    }


}
