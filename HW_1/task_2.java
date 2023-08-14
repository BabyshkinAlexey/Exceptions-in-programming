/*
    Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
    Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением
    "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class task_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try 
        {
            System.out.print("Введите первое целое число: ");
            int a = sc.nextInt();
            System.out.print("Введите второе целое число: ");
            int b = sc.nextInt();
            System.out.println(a + " / " + b + " = " + a / b);
        } 
        catch (InputMismatchException e1) 
        {
            System.out.println("Ошибка: некорректный ввод. Вводите целые числа!");
        } 
        catch (ArithmeticException e2) 
        {
            System.out.println("Деление на ноль недопустимо!");
        }
        sc.close();
    }
}
