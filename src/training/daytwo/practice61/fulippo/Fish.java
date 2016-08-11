package training.daytwo.practice61.fulippo;

public class Fish extends Animal implements Pet {

    private String name;

    public Fish() {
        super(0);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Fish: I am a fish and I play with a Ps4");
    }

    @Override
    public void eat() {
        System.out.println("Fish: I eat pizza!");
    }

    @Override
    public void walk() {
        System.out.println("Fish: I don't walk, I run!");
    }
}
