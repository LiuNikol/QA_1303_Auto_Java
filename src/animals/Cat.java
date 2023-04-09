package animals;
public class Cat extends Animal{
    private String color;  //private field
    public Cat(boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }
    public Cat(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.color = "blue";
    }
    public Cat() {
    }
    public String getColor() {
        return color;
    }
   public void setColor(String color) {
       this.color = "blue"; //цей сетер передає дані про колір, константа (змінює на "blue" ),якщо приходять дані з HOMEWORK5
    }

//    public void setColor(String color) {
//      this.color = color; //цей сетер передає дані про колір якщо щось передавалось з  Homework5


}