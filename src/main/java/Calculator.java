
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Calculator
{

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double num,num1;
        System.out.println("\n*******************MiniProject********************\n");
        boolean flag=true;
        while(flag)
        {
            System.out.println("\n");
            System.out.println("1.Square root function : √x");
            System.out.println("2.Factorial function : x!");
            System.out.println("3.Natural logarithm (base е) : ln(x)");
            System.out.println("4.Power function : x^b");
            System.out.println("5.Exit");
            System.out.print("Enter your choice:");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter Number:");
                    num = scanner.nextDouble();
                    System.out.println("Square root of " + num + " is " + calculator.sqrt(num));
                    break;
                case 2:
                    System.out.print("Enter Number:");
                    num = scanner.nextDouble();
                    System.out.println("Factorial of " + num + " is " + calculator.factorial(num));
                    break;
                case 3:
                    System.out.print("Enter Number:");
                    num = scanner.nextDouble();
                    System.out.println("Natural log of " + num + " is " + calculator.logarithm(num));
                    break;
                case 4:
                    System.out.print("Enter base Number:");
                    num = scanner.nextDouble();
                    System.out.print("Enter power for Base:");
                    num1=scanner.nextDouble();
                    System.out.println("Natural log of " + num + " is " + calculator.power_function(num,num1));
                    break;
                case 5:
                    flag=false;
                    break;
                default:
                    System.out.println("Invalid choice please try again");

            }
        }

    }

    public double sqrt(double x)
    {
        double result=0;
        logger.info("Square root of" + x);
        try
        {
            if(x<0)
            {
                result=Double.NaN;
                logger.error("Invalid input:square root of negative number is not possible" );
                throw new ArithmeticException("square root of negative number is not possible");
            }
            else
            {
                result=Math.sqrt(x);
                logger.info("Square root of"+x+"is:" + result);
            }
        }
        catch (ArithmeticException error)
        {
            System.out.println(error.getLocalizedMessage());
        }
        return result;

    }
    public double factorial(double x)
    {
        logger.info("factorial of " + x);
        double result=fact(x);
        logger.info("Factorial of"+ x + "is:"+ result);
        return result;
    }
    public double fact(double x)
    {
        Integer temp=1;
        for(Integer i=1;i<=x;i++)
        {
            temp=i*temp;
        }
        return temp;
    }
    public  double logarithm(double x)
    {
        double result=0;
        logger.info("logarithm of " + x);
        try
        {
            if(x<=0)
            {
                result=Double.NaN;
                logger.error("Invalid input:logarithm of negative number is not possible" );
                throw new ArithmeticException("Natural Log for 0 and negative number is not possible");
            }
            else
            {
                result=Math.log(x);
                logger.info("logarithm of"+ x + "is:"+ result);
            }
        }
        catch (ArithmeticException error)
        {
            System.out.println(error.getLocalizedMessage());
        }
        return result;
    }
    public double power_function(double x1,double x2)
    {
        double result=0;
        logger.info("[POWER - " + x1 + " RAISED TO] " + x2);
        logger.info(x1+"raised to "+ x2);
        try
        {
            if(x1==0 && x2==0)
            {
                result=Double.NaN;
                logger.error("Invalid input:power(0,0) is not definable" );
                throw new ArithmeticException("Pow(0,0) is not possible");
            }
            else
            {
                result=Math.pow(x1, x2);
                logger.info(x1+" raised to "+x2+"is:" + result);
            }
            return result;
        }
        catch (ArithmeticException error)
        {
            System.out.println(error.getLocalizedMessage());
        }
        return result;
    }
    //done
    //check 1
}