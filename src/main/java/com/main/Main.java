package com.main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

import com.SendMail.LegacyMail;
import com.SendMail.NS4SMail;

public class Main {

	public static void main(String[] args) throws ParseException {
	
		
		  DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    Date date1 = dateFormatter .parse("2017-07-14 10:50:30");

		    //Now create the time and schedule it
		    Timer timer1 = new Timer();

		    //Use this if you want to execute it once
		    timer1.schedule(new LegacyMail("1900 HKST.xlsx"), date1);
		    timer1.schedule(new NS4SMail("1900 HKST.xlsx"), date1);
		    
		    
		    
		    Date date2 = dateFormatter .parse("2017-07-14 11:55:30");

		    //Now create the time and schedule it
		    Timer timer2 = new Timer();

		    //Use this if you want to execute it once
		    timer2.schedule(new LegacyMail("2000 HKST.xlsx"), date2);
		    timer2.schedule(new NS4SMail("2000 HKST.xlsx"), date2);
		    
		    
		    
		    
		    Date date3 = dateFormatter .parse("2017-07-14 12:55:30");

		    //Now create the time and schedule it
		    Timer timer3 = new Timer();

		    //Use this if you want to execute it once
		    timer3.schedule(new LegacyMail("2100 HKST.xlsx"), date3);
		    timer3.schedule(new NS4SMail("2100 HKST.xlsx"), date3);
		    
		    
		    
		    Date date4 = dateFormatter .parse("2017-07-14 13:55:30");

		    //Now create the time and schedule it
		    Timer timer4 = new Timer();

		    //Use this if you want to execute it once
		    timer4.schedule(new LegacyMail("2200 HKST.xlsx"), date4);
		    timer4.schedule(new NS4SMail("2200 HKST.xlsx"), date4);
		    
		    
		    
		    Date date5 = dateFormatter .parse("2017-07-14 14:55:30");

		    //Now create the time and schedule it
		    Timer timer5 = new Timer();

		    //Use this if you want to execute it once
		    timer5.schedule(new LegacyMail("2300 HKST.xlsx"), date5);
		    timer5.schedule(new NS4SMail("2300 HKST.xlsx"), date5);
		    
		    
		    
		    Date date6 = dateFormatter .parse("2017-07-14 15:55:30");

		    //Now create the time and schedule it
		    Timer timer6 = new Timer();

		    //Use this if you want to execute it once
		    timer6.schedule(new LegacyMail("0000 HKST.xlsx"), date6);
		    timer6.schedule(new NS4SMail("0000 HKST.xlsx"), date6);
		    
		    
		    
		    Date date7 = dateFormatter .parse("2017-07-14 16:55:30");

		    //Now create the time and schedule it
		    Timer timer7 = new Timer();

		    //Use this if you want to execute it once
		    timer7.schedule(new LegacyMail("0100 HKST.xlsx"), date7);
		    timer7.schedule(new NS4SMail("0100 HKST.xlsx"), date7);
		    
		    
		    
		    
		    Date date8 = dateFormatter .parse("2017-07-14 17:55:30");

		    //Now create the time and schedule it
		    Timer timer8 = new Timer();

		    //Use this if you want to execute it once
		    timer8.schedule(new LegacyMail("0200 HKST.xlsx"), date8);
		    timer8.schedule(new NS4SMail("0200 HKST.xlsx"), date8);
		    
		    
		    
		    
		    Date date9 = dateFormatter .parse("2017-07-14 18:55:30");

		    //Now create the time and schedule it
		    Timer timer9 = new Timer();

		    //Use this if you want to execute it once
		    timer9.schedule(new LegacyMail("0300 HKST.xlsx"), date9);
		    timer9.schedule(new NS4SMail("0300 HKST.xlsx"), date9);
	}
	}


