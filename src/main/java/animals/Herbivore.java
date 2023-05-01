package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {

    public abstract void eat(Food food);

    public Herbivore() {
        this.animalType = "Herbivore";
   }

}
