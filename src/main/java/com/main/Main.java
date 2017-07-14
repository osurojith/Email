package com.main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

import com.SendMail.LegacyMail;
import com.SendMail.NS4SMail;

public class Main {

	public static void main(String[] args) throws ParseException {
	
		
		  DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    Date date1 = dateFormatter .parse("2017-07-14 10:07:30");

		    //Now create the time and schedule it
		    Timer timer1 = new Timer();

		    //Use this if you want to execute it once
		    timer1.schedule(new LegacyMail("0000.txt"), date1);
		    timer1.schedule(new NS4SMail("0000.txt"), date1);
		    
		    
		    
		    Date date2 = dateFormatter .parse("2017-07-14 10:10:30");

		    //Now create the time and schedule it
		    Timer timer2 = new Timer();

		    //Use this if you want to execute it once
		    timer2.schedule(new LegacyMail("0100.txt"), date2);
		    timer2.schedule(new NS4SMail("0100.txt"), date2);
	}
	}


