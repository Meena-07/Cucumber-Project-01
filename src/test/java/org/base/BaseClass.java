package org.base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driv;
	public JavascriptExecutor j;
	public String t;
	
	
	
	public static final String USERNAME = "meena97";
	  public static final String AUTOMATE_KEY = "CsXCQMtadS6gycgGpxuC";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  public static WebDriver setCloudWebApp() throws MalformedURLException
	  {
		  if(driv==null)
		  {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "79");
	    driv = new RemoteWebDriver(new java.net.URL(URL), caps);
	  }
		  return driv;
	  }
	  
	
	public static WebDriver setWebApp() {
		if (driv == null) {
			System.setProperty("webdriver.chrome.driver", "G:\\eclipse works\\AdactinApp\\Drivers\\chromedriver.exe");
			driv = new ChromeDriver();
			driv.manage().window().maximize();
			driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		return driv;
	}

	public void launchUrl(String url) {
		driv.get(url);

	}

	public void maxWindow() {
		driv.manage().window().maximize();
		driv.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public String webAppTitle() {
		String Tit = driv.getTitle();
		return Tit;

	}

	public void selByVisTxt(WebElement w, String vis) {
		Select s = new Select(w);
		s.selectByVisibleText(vis);

	}

	public void closeBrow() {
		driv.close();
	}

	public String gettingAttVal(WebElement w) {
		j = (JavascriptExecutor) driv;
		Object o = j.executeScript("return arguments[0].getAttribute('value')", w);
		t = (String) o;
		return t;
	}

	public void fill(WebElement w, String d) {
		w.sendKeys(d);
	}

	public void buttonClick(WebElement w)

	{
		w.click();
	}

	public static void quitBrowser() {
		driv.quit();
	}

}
