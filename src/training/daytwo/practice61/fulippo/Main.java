package training.daytwo.practice61.fulippo;



public class Main {
    public static void main(String[] args) {

        Spider pork = new Spider();
        Fish goldy = new Fish();
        Cat vicentino = new Cat();

        vicentino.walk();
        vicentino.eat();

        pork.walk();
        pork.eat();


        goldy.eat();
        goldy.walk();

        playWithAnimal(goldy);
        playWithAnimal(pork);
        playWithAnimal(vicentino);
    }

    private static void playWithAnimal(Animal a){
        if(a instanceof Pet){
            ((Pet) a).play();
        } else {
            System.out.println("I am a wild animal: " + a.getClass().getSimpleName().toLowerCase());
        }
    }
}
