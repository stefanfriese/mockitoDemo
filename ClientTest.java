/**
 * 
 */
package quickstart;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;


public class ClientTest {
	
	TimeBasedSalutation salutationMock = mock(TimeBasedSalutation.class);
	

	/**
	 * Test method for {@link quickstart.Client#welcome()} with real TimeBasedSalutation object.
	 * Flaky test case as depending on the current time the test case will pass or fail.
	 */
	@Test
	public void testWelcome() {
        assertEquals(new Client(new TimeBasedSalutation()).welcome(),"Hello and Good Evening!");
        assertEquals(new Client(salutationMock).sayGoodbye(),"Goodbye and see you soon!");
	}

	/**
	 * Test method for {@link quickstart.Client#welcome()} with mocked TimeBasedSalutation object.
	 * Test case uses Mockito to mock TimeBasedSalutation and thus to test Client object in isolation.
	 */
	@Test
	public void testWelcomeMock() {
    	when(salutationMock.greeting()).thenReturn("Good Afternoon!");
        assertEquals(new Client(salutationMock).welcome(),"Hello and Good Afternoon!");
	}
	
}
