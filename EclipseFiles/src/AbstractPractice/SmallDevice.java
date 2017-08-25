package AbstractPractice;
public class SmallDevice extends Component{
	public SmallDevice(){
		battery = new ThinDevice();
	}
	
	public void turnOn(){
		System.out.println("Pressing button...");
		super.turnOn();
	}
	
	public void turnOff(){
		System.out.println("Pressing button...");
		super.turnOff();
	}
	
	public void charge(){
		battery.charge();
	}
	
	public void discharge(){
		battery.discharge();
	}
}
