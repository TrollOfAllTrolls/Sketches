
public class HorseBarn {

	Horse[] horses;

	public HorseBarn(Horse[] horses) {
		this.horses = horses;
	}

	public Horse[] getSpaces() {
		return horses;
	}

	public void consolidate() {
		Horse lastHorse = new Horse("placeholder", 1337);

		for (int i = 0; i < horses.length; i++) {
			for (int j = 0; j < horses.length; j++) {
				if (lastHorse == null && horses[i] != null) {
					horses[i - 1] = horses[i];
					horses[i] = null;
				}
				lastHorse = horses[i];
			}
		}

	}

	public int findHorseSpace(String name) {
		int space = -1;

		for (int i = 0; i < horses.length; i++) {
			if (horses[i] != null) {
				if (horses[i].getName() == name) {
					space = i;
				}
			}
		}

		return space;
	}

	public static HorseBarn createTestBarn() {
		Horse trigger = new Horse("Trigger", 1340);
		Horse silver = new Horse("Silver", 1210);
		Horse lady = new Horse("Lady", 1575);
		Horse patches = new Horse("Patches", 1350);
		Horse duke = new Horse("Duke", 1410);
		Horse[] barn = { trigger, null, silver, lady, null, patches, duke };
		HorseBarn horseBarn = new HorseBarn(barn);

		return horseBarn;
	}
}
