public class LeagueStats {

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

        public int setPoints(int points){
            this.points += points;
        }
    }
}

