package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {

    public void eat(Food food){
        if(!(food instanceof Grass)){
            System.out.println("Еда не является травой");
        }
    }

    public Herbivore() {
        this.animalType = "Herbivore";
   }

}
