package FirstStepsCodingMoreExercise;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double squareMeters = Double.parseDouble(scanner.nextLine());
        double price = squareMeters * 7.61;
        double discount = price * 0.18;
        double totalPrice = price - discount;

        System.out.printf("The final price is: %.2f lv. %n", totalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);

    }
}
//Изход
//
//На конзолата се отпечатват два реда:
//
//· "The final price is: {крайна цена на услугата} lv."
//
//· "The discount is: {отстъпка} lv."