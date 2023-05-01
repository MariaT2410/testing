package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {

    public boolean eat(Food food){
        if(!(food instanceof Meat)){
            System.out.println("Еда не является мясом");
            return false;
        }else return true;
    }

    public Carnivorous() {
        this.animalType ="Carnivorous";
    }

}
