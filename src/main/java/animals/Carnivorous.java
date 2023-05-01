package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {


    public abstract void eat(Food food);


    public Carnivorous() {
        this.animalType ="Carnivorous";
    }

}
