import static org.junit.Assert.*;

import org.junit.Test;


public class ETester {

	@Test
	public void occurrencesTest() {
		int numOfChar = E.occurrences('a', "apple");
		assertEquals(1, numOfChar);
		numOfChar = E.occurrences('p', "applepie");
		assertEquals(3, numOfChar);
		numOfChar = E.occurrences('p', "ppppppp");
		assertEquals(7, numOfChar);
		numOfChar = E.occurrences('q', "ppppppp");
		assertEquals(0, numOfChar);
	}
	
	@Test
	public void dupSTest() {
		String dupS = null;
		dupS = E.dupD("adopted");
		assertEquals("addoptedd", dupS);
		dupS = E.dupD("ddddddd");
		assertEquals("dddddddddddddd", dupS);
		dupS = E.dupD("0000000");
		assertEquals("0000000", dupS);
		dupS = E.dupD("dd00000");
		assertEquals("dddd00000", dupS);
	}
	
	@Test
	public void fixCapTest() {
		String wordSequence = "  where  '\u0131'   is   the LATIN  SMALL LETTER DOTLESS    I character ";
		String fixedWS = E.fixCap(wordSequence);
		assertEquals("Where '\u0131' Is The Latin Small Letter Dotless I Character", fixedWS);
		wordSequence = "  wHERE  ";
		fixedWS = E.fixCap(wordSequence);
		assertEquals("Where", fixedWS);
		wordSequence = "";
		fixedWS = E.fixCap(wordSequence);
		assertEquals("", fixedWS);
	}
	
	@Test
	public void fixNamesTest() {
		String nameSequence = " David Gries;    Ashutosh Saxena;  Haym Hirsh  ";
		String fixedNames = E.fixNames(nameSequence);
		assertEquals("Gries, David; Saxena, Ashutosh; Hirsh, Haym", fixedNames);
	}
	
	@Test
	public void make12hrTest() {
		String[] cases = {"0:5", "1:20", "12:50", "23:59"};
		String time12hr = "";
		String[] expectedResults = {"00:05AM", "01:20AM", "00:50PM", "11:59PM"};
		
		for (int i = 0; i < cases.length; i++) {
			time12hr = E.make12hr(cases[i]);
			assertEquals(expectedResults[i], time12hr);
		}
	}
	
	@Test
	public void fixATest() {
		String[] cases = {"anna", "0000", "aaaa"};
		String fixedA = "";
		String[] expectedResults = {"_a_nn_a_", "0000", "_a__a__a__a_"};
		
		for (int i = 0; i < cases.length; i++) {
			fixedA = E.fixA(cases[i]);
			assertEquals(expectedResults[i], fixedA);
		}
	}

}
