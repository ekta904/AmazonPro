package toolTipHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipHandling2 {

	public static void main(String[] args) {

      WebDriver driver=new ChromeDriver();
      
    //CASE 2 : Using Actions class method
      driver.get("https://jqueryui.com/tooltip/");
      System.out.println("website loaded");

      //Maximise browser window
      driver.manage().window().maximize();

      //Instantiate Action Class
      Actions actions = new Actions(driver);

      //Retrieve WebElement
      WebElement element = driver.findElement(By.cssSelector("#age"));

      // Using the action class to mimic mouse hover
      actions.moveToElement(element).perform();
      WebElement toolTip = driver.findElement(By.xpath("//*[@id='age']"));

      // To get the tool tip text and assert
      String toolTipText = toolTip.getText();
      System.out.println("toolTipText-->"+toolTipText);

      //Verification if tooltip text is matching expected value
      if(toolTipText.equalsIgnoreCase("We ask for your age only for statistical purposes.")){
      System.out.println("Pass");
      }else{
      System.out.println("Fail");
      }
      // Close the main window
      driver.close();
      }
      
	}


