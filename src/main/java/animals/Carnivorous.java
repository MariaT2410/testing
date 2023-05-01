package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {


    public void eat(Food food){
        if(!(food instanceof Meat)){
            System.out.println("Еда не является мясом");
        }
    }

    public Carnivorous() {
        this.animalType ="Carnivorous";
    }

}
