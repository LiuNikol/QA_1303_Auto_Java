package calculate;

import java.util.Scanner;
public class homework4 {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter first number");
            int number=scanner.nextInt();
            int number2;
            double result = 0;
            char simbol;
            System.out.println("enter second number");
            number2=scanner.nextInt();
            System.out.println("enter symbol of operation");
            simbol=scanner.next().charAt(0);
            switch (simbol){
                case '+': result=calculate.sum(number,number2);
                    break;
                case '-': result=calculate.sub(number,number2);
                    break;
                case '*': result=calculate.multiplication(number,number2);
                    break;
                case '/':
                    result=calculate.division(number,number2);

                break;
                case '%': result=calculate.percentage(number,number2);
                    break;
                default:
                    System.out.println("Error");
                    System.exit(0);
                    break;
            }
            System.out.println(result);
        }
    }
