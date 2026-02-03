package DataProvider;

import org.testng.annotations.DataProvider;

public class DataWithRequireFieldBlank {
  
  @DataProvider
  public Object[][] supplyData() {
    return new Object[][] {
      new Object[] { "Boston","New York", " ", "9483 Sctor33", " ", "Delhi", "201301", "American Express",
				" ", "10", " ", "Anurag kumar maurya"},
    };
  }
}
