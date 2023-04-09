package animals;

public class Homework5 {
    public static void main(String[] args) {

        Animal faryland = new Animal(); // об'єкт Animal,змінна яка вказує на імя обєкта , який звертається в клас енімал
        //якщо приватні змінні - то треба присити через get /set
        faryland.setVegetarian(false);
        faryland.setEats("grass, fruits, milk, buggs, other animals");
        faryland.setNoOfLegs(5); // це ми перезаписуєсо дані що є в класі
        System.out.println("About class Animal:");
        System.out.println("is vegetarians: " + faryland.isVegetarian());
        System.out.println("what kind of food: " + faryland.getEats());
        System.out.println("howe many legs: " + faryland.getNoOfLegs());

        System.out.println("------------------");

        Cat fann = new Cat(true,"",6, "red"); //конструктор 1 з Cat
        fann.setVegetarian(false);
        fann.setEats("mouse and beer ");
        fann.setNoOfLegs(2);
        // fann.setColor("black");
        System.out.println("About class Cat:");
        System.out.println("is vegetarians: " + fann.isVegetarian());
        System.out.println("what kind of food: " + fann.getEats());
        System.out.println("howe many legs: " + fann.getNoOfLegs());
        System.out.println("color is : " + fann.getColor());

        System.out.println("------------------");

        Cat fann1 = new Cat(true,"",6); //конструктор 2
        //fann1.setColor("green");
        System.out.println("color is : " + fann1.getColor());

        System.out.println("------------------");
    }
}
//    public static void main(String[] args) {
//    //*нище у дужках перераховані змінні з класів має бути в токому порядку ж як у класі оголощено в конструкторі
 //   //*таке для виведення якщо публічний, якщо приватні змінні - то через get
//        Animal animal = new Animal(true; eats:"meat";noOfLegs:10{});
//        Cat cat = new Cat(false; eats:"mouse";noOflegs:4; color:"red"{});
//        printInfo(Animal);
//        printInfo(Cat);
//        System.out.println("ehehey");
//    }
//
//    private static void printInfo(Animal animal){
//     System.out.println("eats ="+animal.eats);
//     System.out.println("noOflegs ="+animal.getNoOfLegs());
// }
//    private static void printInfo(Cat cat){
//        System.out.println("eats ="+cat.eats);
//        System.out.println("noOflegs ="+cat.getNoOfLegs());
//    }