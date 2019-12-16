import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import dev.utils.StringUtils;
import org.junit.Test;

public class ClasseTestunitperso {

	@Test
	public void testStringUtils() {

		int resultat = StringUtils.levenshteinDistance("sultan", "sultanine");
		assertEquals(3, resultat);
	}

	@Test
	public void test2StringUtils() {

		int resultat = StringUtils.levenshteinDistance("banane", "bananier");
		assertEquals(2, resultat);
	}

	@Test
	public void test3StringUtils() {

		int resultat = StringUtils.levenshteinDistance("lune", "prude");
		assertEquals(3, resultat);
	}

	@Test
	public void test4StringUtils() {

		int resultat = StringUtils.levenshteinDistance("bulle", "ballonnets");
		assertEquals(6, resultat);
	}
	@Test
	public void test5StringUtils() {

		int resultat = StringUtils.levenshteinDistance("emprisonné", "méprisée");
		assertEquals(6, resultat);
	}
	@Test
	public void test6StringUtils() {

		int resultat = StringUtils.levenshteinDistance(null, null);
		assertEquals(0, resultat);
	}
}