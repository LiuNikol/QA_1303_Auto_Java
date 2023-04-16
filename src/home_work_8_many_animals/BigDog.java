package home_work_8_many_animals;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Dog " + getName() + " says: Woow");
    }

    void greets(Dog dog) {
        System.out.println("Dog " + dog.getName() + " says: Woooow");
    }

    void greets(BigDog bigdog) {
        System.out.println("Dog " + bigdog.getName() + " says: Wooooooooow");
    }
}

