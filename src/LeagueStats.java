import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LeagueStats{

    private Set<Team> teams;

    public void LeagueStats(String csvFile) throws FileNotFoundException {

        this.teams = new HashSet<>();
        File myFile = new File(csvFile);
        Scanner sc = new Scanner(myFile);

        while (sc.hasNextLine()){
            String data = sc.nextLine();
            String[] analyze = data.split(",");


        }

    }

    private class Team{
        private String name;
        private int wins;
        private int losses;
        private int goalsScored;
        private int goalsAllowed;
        private int points;

        public Team(String name){
            this.name = name;
            this.wins = 0;
            this.losses = 0;
            this.goalsScored = 0;
            this.goalsAllowed = 0;
            this.points = 0;
        }

        public String getName() {
            return name;
        }

        public int getWins() {
            return wins;
        }

        public void addWins(){
            this.wins++;
        }

        public int getLosses() {
            return losses;
        }

        public void addLoss(){
            this.losses++;
        }

        public int getGoalsScored() {
            return goalsScored;
        }

        public void addGoalsScored(int goals){
            this.goalsScored += goals;
        }

        public int getGoalsAllowed() {
            return goalsAllowed;
        }

        public void addGoalsAllowed(int goals){
            this.goalsAllowed += goals;
        }

        public int getPoints() {
            return points;
        }

        public void setPoints(int points){
            this.points += points;
        }

        @Override
        public boolean equals(Object obj){
            if (!(obj instanceof Team))
                return false;

            return ((Team) obj).name.equals(this.name);
        }
    }
}

