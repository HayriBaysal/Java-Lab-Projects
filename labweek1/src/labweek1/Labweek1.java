
package labweek1;

import java.util.Scanner;

public class Labweek1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] teams = {"Team A", "Team B", "Team C", "Team D"};

        int[] home = {0, 0, 0, 1, 1, 2};
        int[] away = {1, 2, 3, 2, 3, 3};

        int[] played = new int[4];
        int[] wins = new int[4];
        int[] draws = new int[4];
        int[] losses = new int[4];
        int[] points = new int[4];
        int[] goalsFor = new int[4];
        int[] goalsAgainst = new int[4];
        int[] goalDiff = new int[4];

        int[] homeGoals = new int[6];
        int[] awayGoals = new int[6];

        System.out.println("--- FIXTURE ---");
        for (int i = 0; i < 6; i++) {
            System.out.println("Match " + (i + 1) + ": " + teams[home[i]] + " vs " + teams[away[i]]);
        }
        System.out.println();

        for (int i = 0; i < 6; i++) {
            System.out.println("Match " + (i + 1) + ": " + teams[home[i]] + " vs " + teams[away[i]]);
            System.out.print(teams[home[i]] + " goals: ");
            homeGoals[i] = sc.nextInt();
            System.out.print(teams[away[i]] + " goals: ");
            awayGoals[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("--- MATCH SCORES ---");
        for (int i = 0; i < 6; i++) {
            System.out.println("Match " + (i + 1) + ": " + teams[home[i]] + " " + homeGoals[i] + " - " + awayGoals[i] + " " + teams[away[i]]);
        }

        for (int i = 0; i < 6; i++) {
            int a = home[i];
            int b = away[i];

            played[a]++;
            played[b]++;

            goalsFor[a] = goalsFor[a] + homeGoals[i];
            goalsAgainst[a] = goalsAgainst[a] + awayGoals[i];
            goalsFor[b] = goalsFor[b] + awayGoals[i];
            goalsAgainst[b] = goalsAgainst[b] + homeGoals[i];

            if (homeGoals[i] == awayGoals[i]) {
                draws[a]++;
                draws[b]++;
                points[a] += 1;
                points[b] += 1;
            } else if (homeGoals[i] > awayGoals[i]) {
                wins[a]++;
                losses[b]++;
                points[a] += 3;
            } else {
                wins[b]++;
                losses[a]++;
                points[b] += 3;
            }
        }

        for (int i = 0; i < 4; i++) {
            goalDiff[i] = goalsFor[i] - goalsAgainst[i];
        }

        int[] order = {0, 1, 2, 3};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 - i; j++) {
                int x = order[j];
                int y = order[j + 1];
                if (points[y] > points[x] || (points[y] == points[x] && goalDiff[y] > goalDiff[x])) {
                    order[j] = y;
                    order[j + 1] = x;
                }
            }
        }

        System.out.println();
        System.out.println("--- STANDINGS ---");
        for (int i = 0; i < 4; i++) {
            int t = order[i];
            System.out.println((i + 1) + ". " + teams[t]);
            System.out.println("Matches played: " + played[t]);
            System.out.println("Wins: " + wins[t]);
            System.out.println("Draws: " + draws[t]);
            System.out.println("Losses: " + losses[t]);
            System.out.println("Goals for: " + goalsFor[t]);
            System.out.println("Goals against: " + goalsAgainst[t]);
            System.out.println("Goal difference: " + goalDiff[t]);
            System.out.println("Points: " + points[t]);
            System.out.println("-------------------");
        }

        System.out.println();
        System.out.println("Tournament Champion: " + teams[order[0]]);
    }
}
