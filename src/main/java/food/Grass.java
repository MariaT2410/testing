package food;

public class Grass extends Food {

    public Grass(String name) {
        super(name);
    }

    public int getEnargy(){
       return (int) (Math.random() * 5);
    }


}
