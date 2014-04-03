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
		return s.replace("d", "dd");
	}
	
	/** Returns a word sequence with fixed capitalization and spaces. 
	 * (1) No blanks at the beginning and end;
	 * (2) Exactly one blank between adjacent words;
	 * (3) All words capitalized. */
	public static String fixCap(String s) {
		String fixedS = "";
		int indexWS = 0;
		String word = "";
		while (s.equals("") == false) {
			s = s.trim();
			indexWS = s.indexOf(' ');
			if (indexWS >= 0) {
				word = s.substring(0, indexWS);
				word = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
				fixedS = fixedS + word + ' ';
				s = s.substring(indexWS);
			}
			else {
				word = Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
				fixedS = fixedS + word;
				s = "";
			}
		}
		return fixedS;
	}
	
	/** Returns a string with the same names as the input string with the format of every
	 * name being "last, first" and with only 1 blank after each semicolon. */
	public static String fixNames(String s) {
		String fixedNames = "";
		int indexSC = 0;
		String[] name = {"", ""};
		
		while (s.equals("") == false) {
			s = s.trim();
			indexSC = s.indexOf(';');
			if (indexSC >= 0) {
				name = s.substring(0, indexSC).split(" ");
				fixedNames = fixedNames + name[1] + ", " + name[0] + "; ";
				s = s.substring(indexSC + 1);
			}
			else {
				name = s.split(" ");
				fixedNames = fixedNames + name[1] + ", " + name[0];
				s = "";
			}
		}
		return fixedNames;
	}
	
	/** Returns the equivalent 12-hour form of a time of day in 24-hour time. 
	 * Precondition: hour >= 0 and hour < 24;
	 *               min  >= 0 and min  < 60 */
	public static String make12hr(String s) {
		String[] time = {"", ""};
		time = s.split(":");
		int hour = Integer.parseInt(time[0]);
		int min = Integer.parseInt(time[1]);
		
		assert hour >= 0 && hour < 24 && min >= 0 && min < 60;
		
		int hour12 = (hour >= 12) ? (hour - 12) : hour;
		return String.format("%02d:%02d%s", hour12, min, (hour >= 12) ? "PM" : "AM");
	}
	
	/** Return its parameter String s with "_" inserted before and after each 
	 * occurrence of 'a'. */
	public static String fixA(String s) {
		return s.replace("a", "_a_");
	}
}
