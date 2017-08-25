package AbstractPractice;
public class LargeDevice extends Component{
	public LargeDevice() {
		battery = new WideDevice();
	}

	public void turnOn() {
		System.out.println("Turning on...");
		super.turnOn();
	}

	public void turnOff() {
		System.out.println("Turning off...");
		super.turnOff();
	}
	
	public void charge(){
		battery.charge();
	}
	
	public void discharge(){
		battery.discharge();
	}
	
	public void setBattery(Battery bat){
		battery = bat;
		System.out.println("Battery set.");
	}
}
