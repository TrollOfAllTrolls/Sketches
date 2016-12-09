import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public Hospital() {

	}

	public void addDoctor(Doctor doc) {
		doctors.add(doc);
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void addPatient(Patient person) {
		patients.add(person);
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}
}
