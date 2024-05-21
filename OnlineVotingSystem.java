import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] votes = new int[3];

        System.out.println("Welcome to the voting system!");
        System.out.println("1. Candidate 1");
        System.out.println("2. Candidate 2");
        System.out.println("3. Candidate 3");

        while (true) {
            System.out.print("Enter your vote (or 'q' to quit):   ");
            String vote = scanner.next();

            if (vote.equalsIgnoreCase("q")) {
                break;
            }

            int candidate;
            try {
                candidate = Integer.parseInt(vote);
            } catch (NumberFormatException e) {
                System.out.println("Invalid vote. Please try again.");
                continue;
            }

            if (candidate >= 1 && candidate <= 3) {
                votes[candidate - 1]++;
            } else {
                System.out.println("Invalid vote. Please try again.");
            }
        }

        System.out.println("Voting has ended.");
        System.out.println("Candidate 1:   " + votes[0] + " votes");
        System.out.println("Candidate 2:   " + votes[1] + " votes");
        System.out.println("Candidate 3:   " + votes[2] + " votes");
    }
}