package animals;

import food.Food;
import food.Grass;
import food.Meat;

public class Bison extends Herbivore implements Run, Swim, Voice {
    private String name;
    private int satiety;

    public Bison(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
    }

    public Bison() {
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    @Override
    public void run() {
        System.out.println("Бизон бежит");
    }

    @Override
    public String swim() {
        System.out.println("Бизон плавает");
        return "Бизон плавает";

    }

    @Override
    public String getVoice() {
        return "Ммммуауауа";
    }

    @Override
    public boolean eat(Food food) {
        if(super.eat(food)){
            this.satiety +=food.getEnargy();
            return true;
        }else return false;
    }
}
