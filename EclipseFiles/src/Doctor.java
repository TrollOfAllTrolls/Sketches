import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> assignedPatients = new ArrayList<Patient>();
	int patientNum = 0;
	boolean evil = false;

	public Doctor() {

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
		if (evil == false) {
			for (Patient person : assignedPatients) {
				person.checkPulse();
			}
		} else {
			for (Patient person : assignedPatients) {
				person.kill();
			}
		}
	}

	public void becomeEvil() {
		evil = true;
	}

	public boolean isEvil() {
		return evil;
	}
}
