package com.test.assert_manager;
import java.util.Date;
import java.text.SimpleDateFormat;


public abstract class TimeManager {


		public String getCurrentTime() {
		Date date = new Date();
		String curStringDate = new SimpleDateFormat(this.format()).format(date);

		return curStringDate;
	
	} 
	
	

	public abstract String format();
}
