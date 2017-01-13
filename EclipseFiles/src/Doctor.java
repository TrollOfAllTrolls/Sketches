import java.util.ArrayList;
import java.util.Date;

public class Doctor {
	ArrayList<Patient> assignedPatients = new ArrayList<Patient>();
	int patientNum = 0;
	boolean evil = false;
	Hospital Hos;

	public Doctor() {

	}

	public Doctor(String input) {
		if (input == "666") {
			becomeEvil();
		}
	}

	public Doctor(String input, Hospital hospital) {
		if (input == "666") {
			becomeEvil();
		}
		Hos = hospital;
		hospital.addDoctor(this);
	}

	public boolean performsSurgery() {
		boolean canPerformSurgery = false;

		if (this instanceof Surgeon) {
			canPerformSurgery = true;
		}

		return canPerformSurgery;
	}

	public boolean makesHouseCalls() {
		boolean canMakeHouseCalls = false;

		if (this instanceof GeneralPractitioner) {
			canMakeHouseCalls = true;
		}

		return canMakeHouseCalls;
	}

	public void assignPatient(Patient person) throws DoctorFullException {
		if (patientNum < 3) {
			assignedPatients.add(person);
			patientNum++;
		} else if (patientNum > 2) {
			throw new DoctorFullException();
		}
	}

	public ArrayList<Patient> getPatients() {
		return assignedPatients;
	}

	public void giveMedicine() {
		System.out.println(1);
		if (evil == false) {
			for (Patient person : assignedPatients) {
				person.checkPulse();
			}
		} else {
			for (Patient person : assignedPatients) {
				if (Hos != null) {
					Hos.removePatient(person);
					Hos.addZombie(new Zombie(new Date().toString()));
				} else {
					person.kill();
				}
			}
		}
	}

	public void becomeEvil() {
		evil = true;
	}

	public boolean isEvil() {
		return evil;
	}

	public Hospital getHospital() {
		return Hos;
	}
}
