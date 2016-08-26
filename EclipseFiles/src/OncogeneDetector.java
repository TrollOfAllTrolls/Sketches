import java.util.ArrayList;

public class OncogeneDetector {
	public boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequences, String canidate) {
		int totalHealthySequences = healthySequences.size();
		int totalCancerSequences = cancerSequences.size();
		int oncogeneCountHealthy = 0;
		int oncogeneCountCancer = 0;
		double oncogenePercentHealthy = 0;
		double oncogenePercentCancer = 0;
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

		oncogenePercentHealthy = oncogeneCountHealthy / totalHealthySequences;
		oncogenePercentCancer = oncogeneCountCancer / totalCancerSequences;

		if (oncogenePercentCancer > oncogenePercentHealthy) {
			isOncogene = true;
		}

		return isOncogene;
	}
}
