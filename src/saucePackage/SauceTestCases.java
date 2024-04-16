package saucePackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceTestCases extends Parameters {
	
	@BeforeTest
	
	
	public void mySetup() {
	
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		
		
		
	}
	
	
	
	 
	@Test(priority = 1)
	
	
	public void myLogin() throws InterruptedException , IOException   {
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys(MyUserName);
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(MyPassword);
		
		Thread.sleep(2000);
		
		
		WebElement LoginBtn = driver.findElement(By.id("login-button"));
		LoginBtn.click();
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File file = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("./src/Images/1.jpg"));
		
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 2, enabled = false)
	
	public void addTwoRandIItem() throws InterruptedException {
		
		WebElement Contanier = driver.findElement(By.className("inventory_list"));
		
		List <WebElement> MyProductList = Contanier.findElements(By.tagName("button"));
		
		for(int i =0 ; i<2 ;i++) {
			
			int RandomIndex = rand.nextInt(MyProductList.size());
			
			MyProductList.get(RandomIndex).click();
			
			Thread.sleep(2000);
			
		}
			
		}
		
		
		@Test(priority = 3,enabled =  false)
		
		
		public void checkOutProcess() throws InterruptedException {
			
			
			WebElement cartBtn = driver.findElement(By.cssSelector(".shopping_cart_link"));
			cartBtn.click();
			
			Thread.sleep(2000);
			
			WebElement checkoutBtn = driver.findElement(By.id("checkout"));
			checkoutBtn.click();
			
			Thread.sleep(2000);
			
			
			WebElement FirstName = driver.findElement(By.id("first-name"));
			
			FirstName.sendKeys(CheckOutFN);
					
			
			Thread.sleep(1000);
			
            WebElement LastName = driver.findElement(By.id("last-name"));
			
			LastName.sendKeys(CheckOutLN);
					
			
			Thread.sleep(1000);
			
            WebElement ZipCode = driver.findElement(By.id("postal-code"));
			
			ZipCode.sendKeys(CheckOutZipCode);
					
			
			Thread.sleep(1000);
			
			
			WebElement CountinueBtn = driver.findElement(By.id("continue"));
			CountinueBtn.click();
			
			Thread.sleep(1000);
			WebElement FinishBtn = driver.findElement(By.id("finish"));
			FinishBtn.click();
			
			
		}
		
	
		@Test(priority = 4 , enabled = false)

		public void logoutProcess() throws InterruptedException {
			
			WebElement MenuBtnLeftCorner = driver.findElement(By.id("react-burger-menu-btn"));
			MenuBtnLeftCorner.click();
			
			Thread.sleep(2000);
			
			
			WebElement LogoutBtn = driver.findElement(By.cssSelector(".bm-item.menu-item"));
			LogoutBtn.click();
			
			Thread.sleep(2000);
			
		}
		
		
		@Test(priority = 5)
		
		
		public void FilterItem() throws InterruptedException {
			
			WebElement Filter = driver.findElement(By.className("product_sort_container"));
			
			Select select = new Select(Filter);
			
			Thread.sleep(2000);
			
			select.selectByValue("hilo");
			
			
		}
		
            
          @Test(priority = 6)
          
          public void addFirstandLastItem() throws InterruptedException, IOException {
        	  
        	  // Add the first item to the cart
              List<WebElement> addToCartButtons = driver.findElements(By.className("btn_primary"));
              addToCartButtons.get(0).click();
              
              Thread.sleep(1000);

              // Add the last item to the cart
              addToCartButtons.get(5).click();
              
              Thread.sleep(3000);
              
              
            TakesScreenshot ts = (TakesScreenshot) driver;
      		
      		File file = ts.getScreenshotAs(OutputType.FILE);
      		
      		FileUtils.copyFile(file, new File("./src/Images/2.jpg"));
      		
      		Thread.sleep(2000);
              
            
          }
            
            
			@Test(priority = 7)
			
			
			public void checkOutProcessTwo() throws InterruptedException {
				
				
				WebElement cartBtn = driver.findElement(By.cssSelector(".shopping_cart_link"));
				cartBtn.click();
				
				Thread.sleep(2000);
				
				WebElement checkoutBtn = driver.findElement(By.id("checkout"));
				checkoutBtn.click();
				
				Thread.sleep(2000);
				
				
				WebElement FirstName = driver.findElement(By.id("first-name"));
				
				FirstName.sendKeys(CheckOutFN);
						
				
				Thread.sleep(1000);
				
	            WebElement LastName = driver.findElement(By.id("last-name"));
				
				LastName.sendKeys(CheckOutLN);
						
				
				Thread.sleep(1000);
				
	            WebElement ZipCode = driver.findElement(By.id("postal-code"));
				
				ZipCode.sendKeys(CheckOutZipCode);
						
				
				Thread.sleep(1000);
				
				
				WebElement CountinueBtn = driver.findElement(By.id("continue"));
				CountinueBtn.click();
				
				Thread.sleep(1000);
				WebElement FinishBtn = driver.findElement(By.id("finish"));
				FinishBtn.click();
				
				
				Thread.sleep(3000);
				
				
				String ExpectedMessage = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
				String ActualMessage = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/div")).getText();
	            
	            myAssert.assertEquals(ActualMessage, ExpectedMessage, "This Is Checkout Process");
				
				System.out.println(ActualMessage);
				System.out.println(ExpectedMessage);
				
				
				
			}
			
			
			
		

}
