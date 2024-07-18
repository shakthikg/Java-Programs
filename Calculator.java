import java.util.Scanner;
class Calculator
{
    public static void main(String[] args)
    {
        char oper;
        double num1,num2,res;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an operator: +,-,*,or /");
        oper = input.next().charAt(0);
        System.out.println("enter num1: ");
        num1 = input.nextDouble();
        System.out.println("enter num2: ");
        num2 = input.nextDouble();
        switch(oper)
        {
            case '+':
                res = num1+num2;
                System.out.println(num1+"+"+num2+"="+res);
                break;
            case '-':
                res = num1-num2;
                System.out.println(num1+"-"+num2+"="+res);
                break;
            case '*':
                res = num1*num2;
                System.out.println(num1+"*"+num2+"="+res);
                break;
            case '/':
                res = num1+num2;
                System.out.println(num1+"/"+num2+"="+res);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}