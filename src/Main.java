import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int price; // переменная обозначающая стоимость полёта
        int bonus; // переменная обозначающая бонусы
        System.out.print("Введите стоимость полёта: ");
        price = in.nextInt();

        bonus = price/20;
        System.out.println("Количество начисленных за полёт баллов: " + bonus);
    }
}