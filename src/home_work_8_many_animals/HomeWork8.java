package home_work_8_many_animals;

public class HomeWork8 {
    public static void main(String[] args) {
        Dog dog = new Dog("DogSharick");
        dog.greets();
        Dog dog1 = new Dog("DogSpyke");
        dog.greets(dog1);
        Cat cat = new Cat("CatVaska");
        ss(cat);
        ss(dog);
    }

    public static void ss(Animal animal) {
        System.out.println(animal.getName() + " hello");
    }
}

//    public static void inter(Pet pet) {
//        pet.feed();
//    }

//    public static void main(String[] args) {  /*from 9 lesson*/
//        Dog dog = new Dog("Spyke");
//        //  System.out.println(dog);
//        Cat cat = new Cat("Spyke");
//        //  System.out.println(cat);
//        Dog dog2 = new Dog("pyke");
//        System.out.println(dog == dog2);
//        System.out.println(dog.equals(cat));
//    }

