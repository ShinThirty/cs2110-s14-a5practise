/** This class contains the exercising methods about String. */
public class E {
	/** Returns the number of times character c appears in string s. */
	public static int number(char c, String s) {
		int number = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == c)
				number++;
		return number;
	}
	
	/** Returns a copy of parameter s with all instances of 'd'
	 * duplicated. */
	public static String dupD(String s) {
		String dupS = "";
		int indexD = 0;
		int startIndex = 0;
		while (startIndex < s.length()) {
			indexD = s.indexOf('d', startIndex);
			if (indexD >= 0) {
				dupS = dupS + s.substring(startIndex, indexD + 1) + 'd';
				startIndex = indexD + 1;
			}
			else {
				dupS = dupS + s.substring(startIndex);
				break;
			}
		}
		return dupS;
	}
	
	/** Returns a word sequence with fixed capitalization and spaces. */
	public static String fixCap(String s) {
		int startIndex = 0;
		String fixedS = "";
		while (startIndex < s.length()) {
			
		}
		
	}
}
