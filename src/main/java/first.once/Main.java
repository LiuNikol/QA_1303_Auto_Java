import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int i = 20;
        int[] mass = new int[i]; // new int[20];
        char[] arrayChars= new char[5];
        Random rand = new Random();
        //create random numbers
        for(int t=0; t < mass.length; t++) {
            int bound;
            mass[t] = rand.nextInt(bound= 50);
        }
        System.out.println("3.1_Length massive = " + mass.length+", "+"the list of random massive: ");//home task_3_1
        for (int t=0; t < mass.length; t++) {
            System.out.print(mass[t]+" ");
        }
        System.out.println(" ");

        int sum = 0;  //home task_3_2
        for (int element : mass) {
            if (element > 5 && element < 45) {  // condition 5 до 45
                sum += element;
            }
        }
        System.out.print("3.2_The sum is: "+sum+" ");

        System.out.println(" ");
        System.out.println("3.3_The even positive numbers are: "+" "); //home task_3_3
        for(int t = 0; t < mass.length; t++){
            if(mass[t] %2 == 0 && mass[t] != 0){//not 0 in list
                System.out.print(mass[t]+" ");
            }
        }
    }
}

