
//Copyright Wintriss Technical Schools 2016

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;

public class OncogeneTest {
	private OncogeneDetector instance = new OncogeneDetector();

	ArrayList<String> healthySequences = new ArrayList<String>(Arrays.asList(new String[] { "TGCATCC", "AAATTTGGGCCC", "ATGCGCTA", "GGGTACGGAG", "TTAATTGGG" }));

	ArrayList<String> cancerSequences = new ArrayList<String>(Arrays.asList(new String[] { "ATTTGCAGG", "TGCAAATTA", "AAAGGGCCCTTT", "TGCGATACGTAGGACCA", "ACTCATTAGTGC", "AAACGCTAGACACACAAG", "GGGGGGGGGGGG" }));

	ArrayList<String> sequencesWithInvalidElement = new ArrayList<String>(Arrays.asList(new String[] { "ATTTGGG", "TGCGATTTA", "TGCGGHACCA", "ACTCATTAGTGC" }));

	@Test
	public void testOncogeneDetectorWithTGC() {
		assertTrue(instance.isOncogene(healthySequences, cancerSequences, "TGC"));
	}

	@Test
	public void testOncogeneDetectorWithGGG() {
		assertFalse(instance.isOncogene(healthySequences, cancerSequences, "GGG"));
	}

	@Test
	public void testOncogeneDetectorWithEmptyCandiate() {
		assertFalse(instance.isOncogene(healthySequences, cancerSequences, ""));
	}

}
