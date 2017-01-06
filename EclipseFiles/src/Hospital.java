import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public Hospital() {

	}

	public void add(Object person) {
		if (person instanceof Doctor) {
			doctors.add((Doctor) person);
		}
		if (person instanceof Patient) {
			patients.add((Patient) person);
		}
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

	public void assignPatientsToDoctors() {
		int selectedDoctor = 0;
		for (int i = 0; i < patients.size(); i++) {
			try {
				doctors.get(selectedDoctor).assignPatient(patients.get(i));
				System.out.println(selectedDoctor);
			} catch (Exception e) {
				selectedDoctor++;
				i--;
			}
		}
	}

	public void makeDoctorsWork() {
		for (Doctor doc : doctors) {
			doc.giveMedicine();
		}
	}
}
