/**
 * Simple sample app with console output.
 * Copyright: Copyright (c) 2018
 * 
 * @author Stefan Friese
 * @version 0.1
 */
package quickstart;


public class App 
{
	
	public void consoleOutput() {
		Client client = new Client(new TimeBasedSalutation());
		String output = client.welcome();
		System.out.println( output );
		
		output = client.sayGoodbye();
		System.out.println( output );
	}
		
    public static void main( String[] args )
    {
    	App app = new App();
    	app.consoleOutput();
    }
}
