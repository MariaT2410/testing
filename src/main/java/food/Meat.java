package food;

public class Meat extends Food {

    public Meat() {
    }

    public Meat(String name) {
        this.name=name;
    }

    public int getEnergy(){
        return (int) (Math.random() * 10);
    }


}
