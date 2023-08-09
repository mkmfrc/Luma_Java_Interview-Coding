package javacoding.challenges;

import org.testng.annotations.Test;

public class BreakAndContinue {

	//Q. What is break statement and why does it required?
	//@Test
	public void getbreakTheLoop() {
		int num = 100;
		for (int i=0; i<num; i++) {
			if (i == 10) // here 10 is the desired value where we want to break/stop our loop
				break; // break means this will break the loop on desire number "i ==10" and loop will not continue 
			System.out.println(i);
		}
		
	}
	
	@Test
	public void getSkipTheLoop() {
		int num = 10;
		for (int i=0; i<num; i++) {
			if (i == 5)
				continue;
			System.out.println(i);
		}
		
	}
	
}
