package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {
    public boolean eat(Food food){
        if(!(food instanceof Grass)){
            System.out.println("Еда не является травой");
            return false;
        }else return true;
    }

    public Herbivore() {
        this.animalType = "Herbivore";
   }

}
