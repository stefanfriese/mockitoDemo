/**
 * Simple example of a Class with a method that returns different values throughout the day.
 * Copyright: Copyright (c) 2018
 * 
 * @author Stefan Friese
 * @version 0.1
 */
package quickstart;

import java.util.Date;

public class TimeBasedSalutation {
		
	public String greeting() {
        @SuppressWarnings("deprecation")
		int hours = new Date().getHours();

        String greeting;
        if (hours>=1 && hours<=12) {
        	greeting = "Good Morning!";
        } else if (hours>=12 && hours<=18) {
        	greeting = "Good Afternoon!";
        } else if (hours>=18 && hours<=22) {
        	greeting = "Good Evening!";
        }  else {
        	greeting = "Good Night!";
        }     
		return greeting;
	}
	
	public String closingRemark() {
		return "see you soon!";
	}

}
