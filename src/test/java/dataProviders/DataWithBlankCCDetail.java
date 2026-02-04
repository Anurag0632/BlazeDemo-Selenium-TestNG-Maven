package dataProviders;

import org.testng.annotations.DataProvider;

public class DataWithBlankCCDetail {
 
  @DataProvider
  public Object[][] supplyData() {
    return new Object[][] {
      new Object[] {"Philadelphia","London","Vivek", "6832 Sector 4", "Noida", "UP", "201318", "Diner's Club", "",
				"09", "2030", "Vivekanand" },
    };
  }
}
