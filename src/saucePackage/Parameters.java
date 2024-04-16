package saucePackage;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class Parameters {
	
	WebDriver driver = new ChromeDriver();
	Random rand = new Random();
	
	Assertion myAssert = new Assertion();
	
	String URL = "https://www.saucedemo.com/inventory.html";
	String MyUserName = "standard_user";
	String MyPassword = "secret_sauce";
			
	String CheckOutFN = "Abdallah";
	String CheckOutLN ="Mansour";
	String CheckOutZipCode ="11784";
	
	
	

}
