
public class Zombie extends Patient {
	String DeathTime;

	public Zombie(String deathtime) {
		DeathTime = deathtime;
	}

	public String getTimeOfDeath() {
		return DeathTime;
	}
}
