package ibm1pack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class miplclass2 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://ksrtc.in/oprs-web/guest/home.do");
		d.manage().window().maximize();
		//Actions a=new Actions(d);
		
		//WebElement e1=d.findElement(By.linkText("Gmail"));
 		//String t=d.getTitle();
		//System.out.println(t);
		//e1.click();
		Thread.sleep(10000);
		//WebElement e2=d.findElement(By.linkText("Sign In"));
		String t=d.getTitle();
				System.out.println(t);
				if(t.equalsIgnoreCase("KSRTC Official Website for Online Bus Ticket Booking - KSRTC.in"))
				{
					 System.out.println("title is correct-No Defect");
				}
					 else
					 {
						 System.out.println("titile is not correct-A"
						 		+ " Defect");

					 }
	boolean  text=d.getPageSource().contains("Welcome to KSRTC");
	if(text)
	{
		 System.out.println("text sign in is present -No Defect");
	}
		 else
		 {
			 System.out.println("text sign in is not present -A Defect");

		 }

		
	}

}
