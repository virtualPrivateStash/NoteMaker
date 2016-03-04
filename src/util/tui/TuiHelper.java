package util.tui;

public class TuiHelper {

	public static final String  COL_RESET 				= "\u001B[0m";
	public static final String  COL_ALERT 				= "\u001B[91m";
	public static final String  COL_STD_BLACK 			= "\u001B[30M";
	public static final String  COL_GREEN 				= "\u001B[32m";
	public static final String  COL_headingNxtOutput	= COL_GREEN;
	public static final String  COL_BLUE_OWN 			= "\u001B[38;5;21m";

	
	
	
	
	
	public static String paintString(String color, String string) {
		StringBuilder colorString = new StringBuilder();
		colorString.append(color + string + COL_RESET);
		return colorString.toString();
	}
	
	
}
