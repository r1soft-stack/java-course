package training.daytwo.practice61.fulippo;

public class Cat extends Animal implements Pet{

    private String name;

    public Cat() {
        super(4);

        this.name = "fluffy";
    }

    public Cat(String name){
        super(4);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Cat: I am a cat and I play with pussy");
    }

    @Override
    public void eat() {
        System.out.println("Cat: I eat pizza!");
    }

    @Override
    public void walk() {
        System.out.println("Cat: I don't walk, I jump!");
    }
}
