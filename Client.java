/**
 * Simple example of a Class which depends on another Class with changing behavior.
 * Copyright: Copyright (c) 2018
 * 
 * @author Stefan Friese
 * @version 0.1
 */
package quickstart;

public class Client {

	TimeBasedSalutation timeBasedSalutation;
	
	public Client(TimeBasedSalutation timeBasedSalutation) {
		this.timeBasedSalutation = timeBasedSalutation;
	}
	
	public String welcome() {
		return "Hello and " +  timeBasedSalutation.greeting();
	}
	
	public String sayGoodbye() {
		return "Goodbye and " + timeBasedSalutation.closingRemark();
	}

}
