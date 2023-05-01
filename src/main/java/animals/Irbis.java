package animals;

import food.Food;
import food.Grass;
import food.Meat;

public class Irbis extends Carnivorous implements Run, Voice, Swim{
    private String name;
    private int satiety;

    public Irbis(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
    }

    public Irbis() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    @Override
    public void run() {
        System.out.println("Ирбис бежит");

    }

    @Override
    public String getVoice() {
        return "Ррррррр";
    }

    @Override
    public String swim() {
        System.out.println("Ирбис плавает");
        return "Ирбис плавает";

    }

    @Override
    public boolean eat(Food food) {
        if(super.eat(food)){
            this.satiety +=food.getEnargy();
            return true;
        }else return false;
    }
}
