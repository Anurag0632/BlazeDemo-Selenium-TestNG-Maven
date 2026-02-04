package dataProviders;

import org.testng.annotations.DataProvider;

public class SendPositiveData {

	@DataProvider
	public Object[][] supplyData() {
		return new Object[][] {
				new Object[] { "Boston", "New York", "Anurag", "9483 Sctor33", "Delhi", "Delhi", "201301",
						"American Express", "9567432100039532", "10", "2031", "Anurag kumar maurya" },
				new Object[] { "Philadelphia", "London", "Vivek", "6832 Sector 4", "Noida", "UP", "201318",
						"Diner's Club", "45867039123684923", "09", "2030", "Vivekanand" },
				new Object[] { "São Paolo", "Rome", "Upendra", "dheps obra", "Sonebhadra", "UP", "231219", "Visa",
						"3950684312003922", "07", "2027", "Upendra Sharma" } };
	}
}
