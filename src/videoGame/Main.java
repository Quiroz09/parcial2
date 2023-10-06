package videoGame;

public class Main {
    public static void main(String[] args) {

        VideoGames sportsGame = VideoGames.SPORTS;
        VideoGames strategyGame = VideoGames.STRATEGY;
        VideoGames musicalsGame = VideoGames.MUSICALS;
        VideoGames adventureGame = VideoGames.ADVENTURE;
        VideoGames simulationGame = VideoGames.SIMULATION;


        System.out.println("Game information:");
        System.out.println("Sports Game: " + sportsGame.getGameName());
        System.out.println("How to play: " + sportsGame.getHowToPlay());
        System.out.println("Year of creation: " + sportsGame.getYearOfCreation());
        System.out.println("Position classification: " + sportsGame.showPositionRanking());
        System.out.println("Coin purchase: " + sportsGame.buyCoins());
        System.out.println();

        System.out.println("Strategy game: " + strategyGame.getGameName());
        System.out.println("How to play: " + strategyGame.getHowToPlay());
        System.out.println("Year of creation: " + strategyGame.getYearOfCreation());
        System.out.println("Position classification: " + strategyGame.showPositionRanking());
        System.out.println("Coin purchase: " + strategyGame.buyCoins());
        System.out.println();

        System.out.println("Musical Game: " + musicalsGame.getGameName());
        System.out.println("How to play: " + musicalsGame.getHowToPlay());
        System.out.println("Year of creation: " + musicalsGame.getYearOfCreation());
        System.out.println("Position classification: " + musicalsGame.showPositionRanking());
        System.out.println("Coin purchase: " + musicalsGame.buyCoins());
        System.out.println();

        System.out.println("Adventure Game: " + adventureGame.getGameName());
        System.out.println("How to play: " + adventureGame.getHowToPlay());
        System.out.println("Year of creation: " + adventureGame.getYearOfCreation());
        System.out.println("Position classification: " + adventureGame.showPositionRanking());
        System.out.println("Coin purchase: " + adventureGame.buyCoins());
        System.out.println();

        System.out.println("Simulation Game: " + simulationGame.getGameName());
        System.out.println("How to play: " + simulationGame.getHowToPlay());
        System.out.println("Year of creation: " + simulationGame.getYearOfCreation());
        System.out.println("Position classification: " + simulationGame.showPositionRanking());
        System.out.println("Coin purchase: " + simulationGame.buyCoins());
    }
}

