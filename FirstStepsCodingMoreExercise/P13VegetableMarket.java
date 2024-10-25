package FirstStepsCodingMoreExercise;

import java.util.Scanner;

public class P13VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Вход
        //От конзолата се четат 4 числа, по едно на ред:
        //•	Първи ред – Цена за килограм зеленчуци – реално число[0.00… 1000.00]
        //•	Втори ред – Цена за килограм плодове – реално число[0.00… 1000.00]
        //•	Трети ред – Общо килограми на зеленчуците – цяло число[0… 1000]
        //•	Четвърти ред – Общо килограми на плодовете – цяло число[0… 1000]
        double vegetablesPrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        int kilogramsVegetables = Integer.parseInt(scanner.nextLine());
        int kilogramsFruits = Integer.parseInt(scanner.nextLine());

        //Градинар продавал реколтата от градината си на зеленчуковата борса.
        // Продава зеленчуци за N лева на килограм и плодове за M лева за килограм.
        // Напишете програма, която да пресмята приходите от реколтата в евро
        // ( ако приемем, че едно евро е равно на 1.94лв).
        double income=vegetablesPrice*kilogramsVegetables + fruitsPrice*kilogramsFruits;
        double incomeInEuro=income/1.94;

        //Изход
        //Да се отпечата на конзолата едно число: приходите от всички плодове и зеленчуци в евро.
        //Резултата да се форматира до втория знак след десетичния разделител.
        System.out.printf("%.2f",incomeInEuro);
    }
}
