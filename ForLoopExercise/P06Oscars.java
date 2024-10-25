package ForLoopExercise;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorsName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int countExaminers = Integer.parseInt(scanner.nextLine());
        double totalPoints = academyPoints;

        for (int i = 1; i <= countExaminers; i++) {
            String examinerName = scanner.nextLine();
            double examinerPoints = Double.parseDouble(scanner.nextLine());
            totalPoints += examinerName.length() * examinerPoints / 2;
            if (totalPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorsName, totalPoints);
                break;
            }
        }

        if (totalPoints < 1250.5) {
            double diff = Math.abs(totalPoints - 1250.5);
            System.out.printf("Sorry, %s you need %.1f more!", actorsName, diff);
        }


    }
}
