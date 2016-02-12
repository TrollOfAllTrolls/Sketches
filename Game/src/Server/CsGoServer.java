package Server;

public class CsGoServer {
	
	public static void main(String[] args) {
		Game myFirstGame = new Game("Luxor", "a1");
		Player jack = new Player("Jack", true); //Jack the terrorist
		Player shiva = new Player("Shiva", false);//Shiva the counter force
		Player cole = new Player("Cole", true);//Cole was half-half but...
		cole.connect(myFirstGame);
		shiva.connect(myFirstGame);
		jack.connect(myFirstGame);
		myFirstGame.play();
		for(Player p : myFirstGame.getLeadershipBoard()){
			System.out.println(p.getName() + " got a Score of " + p.getScore() + " Points");
		}
	}
	
//	public void addNewGame(Game game) {
//		
//	}
	
//	public void playAllGames() {
//		
//	}
	
//	public ArrayList<Player> getLeadershipBoard() {
//	
//	}
	
	/**
	 * I. The player class:
	 * 		1. What attributes are needed in a Player class?
	 * 		2. Create those attribute
	 * 		3. Which ones of those attributes remain the same over the game?
	 * 		4. Create a constructor taking those as parameter
	 * 			Don't forget to initialize the other attributes as well.
	 * 		5. Create a dies method that updates the class as necessary when
	 * 			the player dies.
	 * 		6. Create a shoots class taking an other player as parameter.
	 * 			As a first simple version, you have a very powerful weapon
	 * 			The other player dies when shot once.
	 * 		7. create getters for the attributes.
	 * 		8. create a getScore method that calculates the score of the player
	 * 			This is up to you!
	 * 
	 * 	II. The Game class:
	 * 		1. What attributes are needed in a Player class?
	 * 		2. Create those attribute
	 * 		3. Which ones of those attributes remain the same over the game?
	 * 		4. Create a constructor taking those as parameter
	 * 			Don't forget to initialize the other attributes as well.
	 * 		5. Create a addPlayer method to add a player to that game
	 * 		6. Create an isOver() method, returning true if the game is over
	 * 			For example, if one of the players has reached 10 kills
	 * 		7. Create a play method that simulates the game. It should do the following:
	 * 			- pick a random player
	 * 			- pick an other random player
	 * 			- have the first player shoot the other one
	 * 			- repeat until the game is over
	 * 
	 * 	III. The Server class
	 * 		1. In your main method:
	 * 			- Create a new Game
	 *          - Add all of you to that game
	 *          - Play that game
	 *          - add the necessary print statements to monitor the game
	 *          
	 *  IV. We can do better
	 *  		1. Create a getWinner method in your game class and
	 *  			update your code in the main method to congratulate the winner
	 *  		2. Create a getLeadershipBoard method in your game class 
	 *  			to get the ranking of the top 3 players
	 *  		2. update the play method in the Game class so that
	 *  			we don't pick twice the same player randomly to avoid self-killing
	 *  		3. Update the Server class to be able to handle multiple games on the server
	 *  		4. Create a addNewGame method in the Server Class
	 *  		5. Create a playAllGames method so that all games on the server are played
	 *  		6. Create a getLeadershipBoard in the server class,
	 *  			across all games on the server
	 *  		7. Come up with some funny stats to get and implement it
	 *  			Example: The player that got shot the most across all games
	 *  		8. Come up with a way to improve your game and implement it
	 *  			Example: A player should die only after getting shot 3 times
	 *  			Example2: you have a chance to miss when shooting a player
	 */
}
