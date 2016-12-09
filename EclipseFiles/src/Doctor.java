
public class Doctor {
	Patient assignedPatients[] = new Patient[3];
	int patientNum = 0;

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

	public void assignPatient(Patient person) {
		if (patientNum < 3) {
			assignedPatients[patientNum] = person;
			patientNum++;
		}
	}

	public Patient[] getPatients() {
		return assignedPatients;
	}
}
