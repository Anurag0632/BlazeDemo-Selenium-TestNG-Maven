package dataProviders;

import org.testng.annotations.DataProvider;

public class smokeSupplyData {
 
  @DataProvider
  public Object[][] supplyData(
		  ) {
    return new Object[][] {
      new Object[]  {"Boston","New York", "Anurag", "9483 Sctor33", "Delhi", "Delhi", "201301", "American Express",
				"9567432100039532", "10", "2031", "Anurag kumar maurya" }
    };
  }
}
