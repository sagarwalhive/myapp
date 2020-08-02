package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalenderUtil {
	
	public static String getTodayDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		Date todayDate = new Date();
		return sdf.format(todayDate);
	}
	
	// Added a comment in coumputer 1
	public static void main(String[] args) {
		// Get todays date
		System.out.println(getTodayDate());
	}

}
