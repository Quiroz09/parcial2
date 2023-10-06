package videoGame;

public enum VideoGames {
    SPORTS("fifa","play 5 controller","2024"){
        @Override
        public String showPositionRanking() {
            return "fifa";
        }

        @Override
        public String buyCoins() {
            return "2024";
        }
    },
    STRATEGY("Hitman absolution","xbox 360","2011"){
        @Override
        public String showPositionRanking() {
            return "Hitman absolution";
        }

        @Override
        public String buyCoins() {
            return "2011";
        }
    },
    MUSICALS("guitar hero","guitar","2000"){
        @Override
        public String showPositionRanking() {
            return "guitar hero";
        }

        @Override
        public String buyCoins() {
            return "2000";
        }
    },
    ADVENTURE("ratchet clank","playStation","2014"){
        @Override
        public String showPositionRanking() {
            return "ratchet clank";
        }

        @Override
        public String buyCoins() {
            return "2014";
        }
    },
    SIMULATION("bus simulator","controller","2019"){
        @Override
        public String showPositionRanking() {
            return "bus simulator";
        }

        @Override
        public String buyCoins() {
            return "2019<";
        }
    };

    private String GameName;
    private String HowToPlay;
    private String yearOfCreation;

    public String getGameName() {
        return GameName;
    }

    public void setGameName(String gameName) {
        GameName = gameName;
    }

    public String getHowToPlay() {
        return HowToPlay;
    }

    public void setHowToPlay(String howToPlay) {
        HowToPlay = howToPlay;
    }

    public String getYearOfCreation() {
        return yearOfCreation;
    }

    VideoGames(String gameName, String howToPlay, String yearOfCreation) {
        GameName = gameName;
        HowToPlay = howToPlay;
        this.yearOfCreation = yearOfCreation;
    }

    public void setYearOfCreation(String yearOfCreation) {
        this.yearOfCreation = yearOfCreation;


    }

    public abstract String showPositionRanking();
    public abstract String buyCoins();
}

