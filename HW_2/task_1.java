/*
    Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
    Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException
    c сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".
*/

import java.util.Scanner;

public class task_1
{
    public static void main(String[] args) 
    {
        while (true) 
        {
            try 
            {
                System.out.print("Введите число: ");
                Scanner sc = new Scanner(System.in);
                String userInput = sc.nextLine();
                int n = Integer.parseInt(userInput);
                sc.close();
                if (n > 0) 
                {
                    System.out.println("Число корректно");
                    break;
                } 
                else 
                {
                    System.out.println("Некорректное число");
                    break;
                }
            } 
            catch (NumberFormatException ex) 
            {
                System.out.println("Некорректный ввод!");
            }
        }
    }
}