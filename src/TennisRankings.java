import java.util.Scanner;

public class TennisRankings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfTournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int currentPoints = 0;
        double winCount = 0;

        for (int i = 0; i < numberOfTournaments ; i++) {
            String currentSpot = scanner.nextLine();
            if ( currentSpot.equals("F")){
                currentPoints += 1200;
            } else if (currentSpot.equals("W")) {
                currentPoints += 2000;
                winCount++;
            }else {
                currentPoints += 720;
            }
        }

        int finalPoints = currentPoints + startingPoints;
        int averagePoints = currentPoints / numberOfTournaments;
        double winCountPro = (winCount / numberOfTournaments) *100;

        System.out.println("Final points: " + finalPoints);
        System.out.println("Average points: " + averagePoints);
        System.out.printf("%.2f%%", winCountPro);


    }
}
