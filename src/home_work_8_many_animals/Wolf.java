package home_work_8_many_animals;

public class Wolf extends Animal implements WildAnimal {
    public Wolf(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Wolf " + getName() + " says: Hawoo");
    }

    @Override
    public void hunting() {
        System.out.println("Wolf " + getName() + " goes hunting");
    }
}
