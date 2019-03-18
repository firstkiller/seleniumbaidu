package openbaidu;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Openbaidu {
	@Test
	public void open(){
	System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="localhost:8080/Banksys_ssh";
	driver.get(url);
}
}