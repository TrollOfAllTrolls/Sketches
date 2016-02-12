package Server;

import java.util.Comparator;
import java.util.Random;

public class Player {
	private final String name;
	private int kills;
	private int deaths;
	private boolean isTerrorist;
	private final static String GUN_SNIPER = "▄︻̷̿┻̿═━一";
	private final static String GUN_AR = "︻╦╤─";
	private final static String GUN_GIMME = "༼ つ ◕_◕ ༽つ";
	Random r = new Random();

	public Player(String name, boolean isTerrorist) {
		this.name = name;
		this.isTerrorist = isTerrorist;
		this.kills = 0;
		this.deaths = 0;
	}

	public int getKills() {
		return kills;
	}

	public void dies() {
		deaths -= 1;
	}

	public String getName() {
		return name;
	}

	public void shoots(Player otherPlayer) {
		kills += 1;
		otherPlayer.dies();
		if (r.nextBoolean()) {
			System.out.println(this.getName() + " " + GUN_SNIPER + " " + otherPlayer.getName());
		} else if (r.nextBoolean()) {
			System.out.println(this.getName() + " " + GUN_AR + " " + otherPlayer.getName());
		} else {
			System.out.println(this.getName() + " " + GUN_GIMME + " " + otherPlayer.getName());
		}
	}

	public void connect(Game game) {
		game.addPlayer(this);
	}

	public int getScore() {
		return 2 * kills - deaths;
	}

}
