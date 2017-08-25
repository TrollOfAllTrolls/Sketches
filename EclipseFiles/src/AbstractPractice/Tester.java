package AbstractPractice;
public class Tester {
	public static void main(String[] args) {
		LargeDevice lDev = new LargeDevice();
		SmallDevice sDev = new SmallDevice();

		sDev.charge();
		sDev.turnOn();
		sDev.discharge();
		sDev.turnOff();
		
		System.out.println("");

		lDev.charge();
		lDev.turnOn();
		lDev.discharge();
		lDev.turnOff();
		
		System.out.println("");
		
		lDev.setBattery(new ThinDevice());
		
		System.out.println("");
		
		lDev.charge();
		lDev.turnOn();
		lDev.discharge();
		lDev.turnOff();
	}
}
