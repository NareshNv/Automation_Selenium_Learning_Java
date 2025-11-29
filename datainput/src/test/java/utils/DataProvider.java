package utils;

import java.io.IOException;

public class DataProvider {

	@org.testng.annotations.DataProvider
	public Object[][] getUserLoginData() throws IOException{
		LoginUserData login = new LoginUserData();
		Object[][] exceil = login.readExceil();
		return exceil;
		
	}
}
