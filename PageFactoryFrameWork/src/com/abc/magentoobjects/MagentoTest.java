package com.abc.magentoobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoapplication.Home;
import com.abc.magentoapplication.Login;
import com.abc.magentoapplication.Logout;

public class MagentoTest {
	public static void main(String[] args) {
		String url = "http://www.magento.com";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit. SECONDS);
		
		driver.get(url);
		
		Home h = new Home(driver);
		h.clickOnMyAcc();
		
		Login l1 = new Login(driver);
		l1.typeEmail("nitinmanjunath1991@gmail.com");
		l1.typePassord("Welcome123");
		l1.clickOnLogin();
		
		Logout l2 = new Logout(driver);
		l2.clickOnLogout();
		
		driver.quit();
		
		
		
	}


}
