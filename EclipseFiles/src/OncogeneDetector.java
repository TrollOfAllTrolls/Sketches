import java.util.ArrayList;

public class OncogeneDetector {
	public boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequences, String canidate) {
		int totalHealthySequences = healthySequences.size();
		int totalCancerSequences = cancerSequences.size();
		int oncogeneCountHealthy = 0;
		int oncogeneCountCancer = 0;
		float oncogenePercentHealthy = 0;
		float oncogenePercentCancer = 0;
		boolean isOncogene = false;

		for (String sequence : healthySequences) {
			if (sequence.contains(canidate)) {
				oncogeneCountHealthy++;
			}
		}

		for (String sequence : cancerSequences) {
			if (sequence.contains(canidate)) {
				oncogeneCountCancer++;
			}
		}

		oncogenePercentHealthy = oncogeneCountHealthy / (float) totalHealthySequences;
		oncogenePercentCancer = oncogeneCountCancer / (float) totalCancerSequences;
		if (oncogenePercentCancer > oncogenePercentHealthy) {
			isOncogene = true;
		}
		if (isOncogene == true) {
			System.out.println(canidate + " is an Oncogene");
		} else {
			System.out.println(canidate + " is not an Oncogene");
		}
		return isOncogene;
	}
}
