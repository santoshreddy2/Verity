package catalog.catalogpages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestCases {


		private WebDriver driver;
		public CommonMethods CM;
		@FindBy(how=How.LINK_TEXT,using="log yourself in")
		private WebElement LogYourSelfIn;
		@FindBy(how=How.LINK_TEXT,using="Continue")
		private WebElement Continue;
		@FindBy(how=How.XPATH,using="//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")
		private WebElement Male;
		@FindBy(how=How.XPATH,using="//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")
		private WebElement FeMale;
		@FindBy(how=How.LINK_TEXT,using="login page")
		private WebElement LogIn;
		@FindBy(how=How.ID,using="tdb5")
		private WebElement SignIn;
		@FindBy(how=How.NAME,using="email_address")
		private WebElement Email;
		@FindBy(how=How.XPATH,using="//*[@id='bodyContent']/div[2]/div/form/table/tbody/tr[2]/td[2]/input")
		private WebElement Password;
		@FindBy(how=How.XPATH,using="//*[@id='tdb4']/span[2]")
		private WebElement Continuee;
		
		
		
	@BeforeMethod(alwaysRun=true)
	public void Testcase1() {
		
	            CM=new CommonMethods (driver);
			    driver=CM.openBrowser("Chrome");
			    CM.navigateURL("http://107.170.213.234/catalog/");
		        PageFactory.initElements(this.driver, this);
				LogYourSelfIn.click();
				Continue.click();
			    System.out.println("Moving to Welcome page");
			    }
			
		
		
		
		
		
	@AfterMethod
	public void Test() {
	   		   CM= new CommonMethods (driver);
			   CM.closeBrowser();
		       }
		
	
		
		
		
	@Test (groups="p1")
	public void Testcase3(){

			  System.out.println("My Account Information Page is displayed");
			  PageFactory.initElements(this.driver, this);
			  Male.click();
			  driver.findElement(By.name("firstname")).sendKeys("Santosh");
			  driver.findElement(By.name("lastname")).sendKeys("Anreddy");
			  driver.findElement(By.id("dob")).sendKeys("12/23/1990");
			  driver.findElement(By.name("email_address")).sendKeys("anreddysantosh@gail.com");
			  driver.findElement(By.name("company")).sendKeys("Just agile software solutions");
			  driver.findElement(By.name("street_address")).sendKeys("919 mowry aven");
			  driver.findElement(By.name("suburb")).sendKeys("Fremont");
			  driver.findElement(By.name("postcode")).sendKeys("94536");
			  driver.findElement(By.name("city")).sendKeys("Fremont");
			  driver.findElement(By.name("state")).sendKeys("California");
			  driver.findElement(By.xpath("//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[6]/td[2]/select"));
			  Select oSelect = new Select(driver.findElement(By.name("country")));
			  oSelect.selectByVisibleText("United States");
			  driver.findElement(By.name("telephone")).sendKeys("+1(510-4589-206");
			  driver.findElement(By.name("fax")).sendKeys("1234");
			  driver.findElement( By.name("newsletter")).click();
			  driver.findElement(By.name("password")).sendKeys("SANTOSH");
			  driver.findElement(By.name("confirmation")).sendKeys("SANTOSH");
			  PageFactory.initElements(this.driver, this);
	          Continuee.click();
	          System.out.println("Your Account Has Been Created");
	       	  }
		
	
	@Test 
	public void Testcase4(){
		
			 System.out.println("My Account Information Page is displayed");
			 PageFactory.initElements(this.driver, this);
		     FeMale.click();
		     driver.findElement(By.name("firstname")).sendKeys("Santosh");
		     driver.findElement(By.name("lastname")).sendKeys("Anreddy");
			 driver.findElement(By.id("dob")).sendKeys("12/23/1990");
			 driver.findElement(By.name("email_address")).sendKeys("anreddysantosh@gail.com");
			 driver.findElement(By.name("company")).sendKeys("Just agile software solutions");
			 driver.findElement(By.name("street_address")).sendKeys("919 mowry aven");
		     driver.findElement(By.name("suburb")).sendKeys("Fremont");
		     driver.findElement(By.name("postcode")).sendKeys("94536");
		     driver.findElement(By.name("city")).sendKeys("Fremont");
		     driver.findElement(By.name("state")).sendKeys("California");
		     Select oSelect = new Select(driver.findElement(By.name("country")));
		     oSelect.selectByVisibleText("United States");
		     driver.findElement(By.name("telephone")).sendKeys("+1(510-4589-206");
		     driver.findElement(By.name("fax")).sendKeys("1234");
		     driver.findElement( By.name("newsletter")).click();
		     driver.findElement(By.name("password")).sendKeys("SANTOSH");
		     driver.findElement(By.name("confirmation")).sendKeys("SANTOSH");
	         PageFactory.initElements(this.driver, this);
	         Continuee.click();
	         System.out.println("Your Account Has Been Created");
	         }	
		
		
	
	 @Test
	 public void Testcase5(){
		 
		     PageFactory.initElements(this.driver, this);
		     LogIn.click();
		     System.out.println("Came back to log in page");
		     }
	 
	 
	 
	 @Test
	 public void  Testcase6()  {
	 
			 System.out.println("My Account Information Page is displayed");
			 PageFactory.initElements(this.driver, this);
			 FeMale.click();
			 driver.findElement(By.name("firstname")).sendKeys(" ");
			 driver.findElement(By.name("lastname")).sendKeys("Anreddy");
			 driver.findElement(By.id("dob")).sendKeys("12/23/1990");
			 driver.findElement(By.name("email_address")).sendKeys("anreddysantosh@gail.com");
			 driver.findElement(By.name("company")).sendKeys("Just agile software solutions");
			 driver.findElement(By.name("street_address")).sendKeys("919 mowry aven");
			 driver.findElement(By.name("suburb")).sendKeys("Fremont");
			 driver.findElement(By.name("postcode")).sendKeys("94536");
			 driver.findElement(By.name("city")).sendKeys("Fremont");
			 driver.findElement(By.name("state")).sendKeys("California");
			 Select oSelect = new Select(driver.findElement(By.name("country")));
			 oSelect.selectByVisibleText("United States");
			 driver.findElement(By.name("telephone")).sendKeys("+1(510-4589-206");
			 driver.findElement(By.name("fax")).sendKeys("1234");
			 driver.findElement( By.name("newsletter")).click();
			 driver.findElement(By.name("password")).sendKeys("SANTOSH");
			 driver.findElement(By.name("confirmation")).sendKeys("SANTOSH");
			 PageFactory.initElements(this.driver, this);
		     Continuee.click();
		     System.out.println("Error message displayed...First name contain a minimum of 2 characters");
	         }
			
		 
	 
	 
	 
	 @Test
	 public void  Testcase7()  {
			
			 System.out.println("My Account Information Page is displayed");
			 PageFactory.initElements(this.driver, this);
			 FeMale.click();
			 driver.findElement(By.name("firstname")).sendKeys("santosh ");
			 driver.findElement(By.name("lastname")).sendKeys("");
			 driver.findElement(By.id("dob")).sendKeys("12/23/1990");
			 driver.findElement(By.name("email_address")).sendKeys("anreddysantosh@gail.com");
			 driver.findElement(By.name("company")).sendKeys("Just agile software solutions");
			 driver.findElement(By.name("street_address")).sendKeys("919 mowry aven");
			 driver.findElement(By.name("suburb")).sendKeys("Fremont");
			 driver.findElement(By.name("postcode")).sendKeys("94536");
			 driver.findElement(By.name("city")).sendKeys("Fremont");
			 driver.findElement(By.name("state")).sendKeys("California");
			 Select oSelect = new Select(driver.findElement(By.name("country")));
			 oSelect.selectByVisibleText("United States");
			 driver.findElement(By.name("telephone")).sendKeys("+1(510-4589-206");
			 driver.findElement(By.name("fax")).sendKeys("1234");
			 driver.findElement( By.name("newsletter")).click();
			 driver.findElement(By.name("password")).sendKeys("SANTOSH");
			 driver.findElement(By.name("confirmation")).sendKeys("SANTOSH");
			 PageFactory.initElements(this.driver, this);
		     Continuee.click();
		     System.out.println("Error message displayed...Your lastname contain a minimum of 2 characters");
	         }
		
			
	@Test 
	public void  Testcase8() {
	
			
			 System.out.println("My Account Information Page is displayed");
			 PageFactory.initElements(this.driver, this);
			 FeMale.click();
			 driver.findElement(By.name("firstname")).sendKeys("santosh ");
			 driver.findElement(By.name("lastname")).sendKeys("anreddy");
			 driver.findElement(By.id("dob")).sendKeys("");
			 driver.findElement(By.name("email_address")).sendKeys("anreddysantosh@gail.com");
			 driver.findElement(By.name("company")).sendKeys("Just agile software solutions");
			 driver.findElement(By.name("street_address")).sendKeys("919 mowry aven");
			 driver.findElement(By.name("suburb")).sendKeys("Fremont");
			 driver.findElement(By.name("postcode")).sendKeys("94536");
			 driver.findElement(By.name("city")).sendKeys("Fremont");
			 driver.findElement(By.name("state")).sendKeys("California");
			 Select oSelect = new Select(driver.findElement(By.name("country")));
			 oSelect.selectByVisibleText("United States");
			 driver.findElement(By.name("telephone")).sendKeys("+1(510-4589-206");
			 driver.findElement(By.name("fax")).sendKeys("1234");
			 driver.findElement( By.name("newsletter")).click();
			 driver.findElement(By.name("password")).sendKeys("SANTOSH");
			 driver.findElement(By.name("confirmation")).sendKeys("SANTOSH");	PageFactory.initElements(this.driver, this);
		     Continuee.click();
		     System.out.println("Error message displayed...DOB error");
		     }	
	 
		
	 @Test 
	 public void  Testcase9() {
	
			 System.out.println("My Account Information Page is displayed");
			 PageFactory.initElements(this.driver, this);
			 FeMale.click();
			 driver.findElement(By.name("firstname")).sendKeys("santosh ");
			 driver.findElement(By.name("lastname")).sendKeys("anreddy");
			 driver.findElement(By.id("dob")).sendKeys("12/23/1990");
			 driver.findElement(By.name("email_address")).sendKeys("anreddysantosh@gail.com");
			 driver.findElement(By.name("company")).sendKeys("");
			 driver.findElement(By.name("street_address")).sendKeys("919 mowry aven");
			 driver.findElement(By.name("suburb")).sendKeys("Fremont");
			 driver.findElement(By.name("postcode")).sendKeys("94536");
			 driver.findElement(By.name("city")).sendKeys("Fremont");
			 driver.findElement(By.name("state")).sendKeys("California");
			 Select oSelect = new Select(driver.findElement(By.name("country")));
			 oSelect.selectByVisibleText("United States");
			 driver.findElement(By.name("telephone")).sendKeys("+1(510-4589-206");
			 driver.findElement(By.name("fax")).sendKeys("1234");
			 driver.findElement( By.name("newsletter")).click();
			 driver.findElement(By.name("password")).sendKeys("SANTOSH");
			 driver.findElement(By.name("confirmation")).sendKeys("SANTOSH");	PageFactory.initElements(this.driver, this);
		     Continuee.click();
		     System.out.println("Error message displayed...company error");
	         }	
	  
	
	
	
	@Test 
	public void  Testcase10() {
	
		 System.out.println("My Account Information Page is displayed");
		 PageFactory.initElements(this.driver, this);
		 FeMale.click();
		 driver.findElement(By.name("firstname")).sendKeys("santosh ");
		 driver.findElement(By.name("lastname")).sendKeys("anreddy");
		 driver.findElement(By.id("dob")).sendKeys("12/23/1990");
		 driver.findElement(By.name("email_address")).sendKeys("anreddysantosh@gail.com");
		 driver.findElement(By.name("company")).sendKeys("Just agile software solutions");
		 driver.findElement(By.name("street_address")).sendKeys("919 mowry aven");
		 driver.findElement(By.name("suburb")).sendKeys("Fremont");
		 driver.findElement(By.name("postcode")).sendKeys("");
		 driver.findElement(By.name("city")).sendKeys("Fremont");
		 driver.findElement(By.name("state")).sendKeys("California");
		 Select oSelect = new Select(driver.findElement(By.name("country")));
		 oSelect.selectByVisibleText("United States");
		 driver.findElement(By.name("telephone")).sendKeys("+1(510-4589-206");
		 driver.findElement(By.name("fax")).sendKeys("1234");
		 driver.findElement( By.name("newsletter")).click();
		 driver.findElement(By.name("password")).sendKeys("SANTOSH");
		 driver.findElement(By.name("confirmation")).sendKeys("SANTOSH");	PageFactory.initElements(this.driver, this);
	     Continuee.click();
	     System.out.println("Error message displayed...Zip error");
	     }






	 @Test
	 public void ReturningCustomer12() throws InterruptedException{
		 
			PageFactory.initElements(this.driver, this);
			LogIn.click();
			Email.sendKeys("anreddysantosh@gmail.com");
			Password.sendKeys("SANTOSH");
            Thread.sleep(3000) ;
			SignIn.click();
			Thread.sleep(3000) ;
		}
	
		
	}




