package animals;

import food.Food;
import food.Grass;

public class Duck extends Herbivore implements Fly, Run,Swim, Voice{
    private String name;
    private int satiety;

    public Duck(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
    }


    public Duck() {
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    @Override
    public void fly() {
        System.out.println("Утка летает");
    }

    @Override
    public void run() {
        System.out.println("Утка убегает");

    }

    @Override
    public String swim() {
        System.out.println("Утка плавает");
        return "Утка плавает";

    }

    @Override
    public String getVoice() {
        return "Кря";
    }

    @Override
    public boolean eat(Food food) {
        if(super.eat(food)){
            this.satiety +=food.getEnargy();
            return true;
        }else return false;
    }
}
