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

        public int getLosses() {
            return losses;
        }

        public int getGoalsScored() {
            return goalsScored;
        }

        public int getGoalsAllowed() {
            return goalsAllowed;
        }

        public int getPoints() {
            return points;
        }
    }
}

