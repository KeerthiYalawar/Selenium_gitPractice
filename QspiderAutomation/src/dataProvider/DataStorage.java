package dataProvider;

import org.testng.annotations.DataProvider;

public class DataStorage {
@DataProvider(parallel = true)
public  Object[][] loginData()
{
	Object data[][]= {
			{"admin","admin"},
			
			{"ad","ad"}
	};
			return data;
			
				
			
			
	}
}


