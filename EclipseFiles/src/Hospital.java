import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	ArrayList<Zombie> zombies = new ArrayList<Zombie>();

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

	public void removePatient(Patient patient) {
		patients.remove(patient);
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void addZombie(Zombie zombie) {
		System.out.println("Called");
		zombies.add(zombie);
	}

	public ArrayList<Zombie> getZombies() {
		return zombies;
	}

	public void assignPatientsToDoctors() {
		int selectedDoctor = 0;
		for (int i = 0; i < patients.size(); i++) {
			try {
				doctors.get(selectedDoctor).assignPatient(patients.get(i));
			} catch (Exception e) {
				selectedDoctor++;
				i--;
			}
		}
	}

	public void makeDoctorsWork() {
		System.out.println(doctors.size());
		for (Doctor doc : doctors) {
			
			doc.giveMedicine();
		}
	}
}
