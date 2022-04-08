import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter the operation that you wish to perform: \n 1.Square Root \n 2.Factorial \n 3.Natural Log\n 4.Power \n 5.Exit\n");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        System.out.println("Enter a number: ");
                        double num = sc.nextDouble();
                        System.out.println("The Square root of " + num + " is: " + square_root_func(num));
                        break;
                    case 2:
                        System.out.println("Enter a number: ");
                        int n= sc.nextInt();
                        System.out.println("The Factorial of " + n+ " is: " + factorial_func(n));
                        break;
                    case 3:
                        System.out.println("Enter a number: ");
                        double number = sc.nextDouble();
                        System.out.println("The Natural log of " + number + " is: " + logarithm_func(number));
                        break;
                    case 4:
                        System.out.print("Enter the number: ");
                        double numb = sc.nextDouble();
                        System.out.print("Enter the power: ");
                        double p = sc.nextDouble();
                        System.out.println("The number " + numb + " raised to power " + p + " is: " + power_func(numb, p));
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Choice!!");
                }

            } catch (InputMismatchException e) {
                System.out.println("The Input is wrong");

            } catch (IllegalArgumentException e) {
                System.out.println("Input cant be negative");
            }


        }
    }

    public static double square_root_func(double num){
        logger.info("Calculating Square Root of : " + num + "\n Result : " + Math.sqrt(num));
        return java.lang.Math.sqrt(num);
    }

    public static double factorial_func(int n){
        if(n<0) {
            logger.info("Factorial of a negative number is not possible!");
            return Double.NaN;
        }
        double f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        logger.info("Factorial of the number : " + n + "\n Result is : " + f);
        return f;
    }

    public static double logarithm_func(double number){
        logger.info("Calculating Natural Logarithm of : " + number + "\n Result : " + Math.log(number));
        return java.lang.Math.log(number);
    }
    public static double power_func(double numb,double p){
        logger.info("Power : " + numb + "^" + p + "/n Result : " + Math.pow(numb, p));
        return java.lang.Math.pow(numb,p);
    }

}


