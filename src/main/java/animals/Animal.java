package animals;

import food.Food;

public abstract class Animal {
    public String animalType;
    public String name;
    public int satiety;
    public int getSatiety() {
        return satiety;
    }

    public abstract void eat(Food food);

}
