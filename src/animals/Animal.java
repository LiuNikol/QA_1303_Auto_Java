package animals;
public class Animal {
    //private fields
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    // constructor with params
    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    // constructor without params
    public Animal() {
    }
    //open getters and setters
    public boolean isVegetarian() {
        return vegetarian;
    }
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    public String getEats() {
        return eats;
    }
    public void setEats(String eats) {
        this.eats = eats;
    }
    public int getNoOfLegs() {
        return noOfLegs;
    }
    public void setNoOfLegs(int noOfLegs)// { this.noOfLegs = noOfLegs;} це стандарт
    {
        if (noOfLegs > 1 && noOfLegs < 5) {  //умова що лап не може бути менше 2 більше 4
            this.noOfLegs = noOfLegs;
        }else {
            this.noOfLegs = 4;} //*якщо лап менше 2 чи більше 4, то виведе 4
        }
}