package animals;
public class Cat extends Animal {
    private String color;  //private field
    public Cat(boolean vegetarian, String eats, int noOfLegs, String color) {  //конструктор 1
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }
    public Cat(boolean vegetarian, String eats, int noOfLegs) {  //конструктор 2
        super(vegetarian, eats, noOfLegs);
        this.color = "blue";
    }
    //public Cat() {
//    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
//   public void setColor(String color) {
//       this.color = "blue"; //цей сетер передає дані про колір, константа (змінює на "blue" ),якщо приходять дані з HOMEWORK5
//    }

}