package TELUS_API;

import com.intuit.karate.junit5.Karate;




class TestRunner {
	
	
	@Karate.Test
	Karate API1() {
         return Karate.run("/P_O_M_Framework/src/test/java/TELUS_API/wirelessaccountlist.feature");

	}
}
