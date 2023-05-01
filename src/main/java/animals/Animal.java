package animals;

import food.Food;

public abstract class Animal {
    public String animalType;
    public String name;

    public abstract boolean eat(Food food);

}
