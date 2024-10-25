package ConditionalStatementsExercise;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        // Иван решава да подобри Световния рекорд по плуване на дълги разстояния.
        // На конзолата се въвежда рекордът в секунди, който Иван трябва да подобри,
        // разстоянието в метри, което трябва да преплува и времето в секунди,
        // за което плува разстояние от 1 м.
        //Вход
        //От конзолата се четат 3 реда:
        //1. Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
        //2. Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
        //3. Времето в секунди, за което плува разстояние от 1 м. - реално число в интервала [0.00 … 1000.00]
        double recordInSeconds = Double.parseDouble (scanner.nextLine());
        double distancePerMeter = Double.parseDouble (scanner.nextLine());
        double secondsPerMeter = Double.parseDouble (scanner.nextLine());
        // Да се напише програма,
        // която изчислява дали се е справил със задачата, като се има предвид, че:
        // съпротивлението на водата го забавя на всеки 15 м. с 12.5 секунди.
        // Когато се изчислява колко пъти Иван ще се забави,
        // в резултат на съпротивлението на водата,
        // резултатът трябва да се закръгли надолу до най-близкото цяло число.
        double delay = Math.floor(distancePerMeter/15)*12.5;
        //Да се изчисли времето в секунди, за което Иван ще преплува разстоянието и разликата спрямо Световния рекорд.
        double totalTime = distancePerMeter * secondsPerMeter + delay;
        double difference = Math.abs(recordInSeconds - totalTime);
        //Изход
        //Отпечатването на конзолата зависи от резултата:
        //· Ако Иван е подобрил Световния рекорд (времето му е по-малко от рекорда) отпечатваме:
        //o "Yes, he succeeded! The new world record is {времето на Иван} seconds."
        if (totalTime<recordInSeconds){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }
        //· Ако НЕ е подобрил рекорда (времето му е по-голямо или равно на рекорда) отпечатваме:
        //o "No, he failed! He was {недостигащите секунди} seconds slower."
        //Резултатът трябва да се форматира до втория знак след десетичната запетая.
    }
}
