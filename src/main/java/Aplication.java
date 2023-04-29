import animals.Kotik;

public class Aplication {
    public static void main(String[] arg){
        System.out.println("Добро пожаловать в котоДОМ");
        //создаём котика через конструктор
        Kotik k = new Kotik("Зефирка", "мур-мяу", 0, 4900);

        //создаём котика2 через пустой конструктор
        Kotik kotik2 = new Kotik();
        kotik2.setName("Печенька");
        kotik2.setVoice("ммррррр");
        kotik2.setSatiety(6);
        kotik2.setWeight(3600);

        //Жизненный путь котика 1 за день
        k.liveAnotherDay();

        // Имя + Вес котика
        System.out.println(k.getName() + " " + k.getWeight());

        //Сравнение голосов котиков
        compareVoice(k, kotik2);

        //количество созданных котиков
        Kotik.getCount();
    }
    private static void compareVoice(Kotik m1, Kotik m2){
        if (m1.getVoice().equals(m2.getVoice())){
            System.out.println("Котики мяукают одинаково");
        }
        else System.out.println("Котики мяукают по-разному");

    }
}
