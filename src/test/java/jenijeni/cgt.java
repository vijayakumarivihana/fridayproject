package jenijeni;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cgt {   
	public static void main(String[] args) throws Throwable {

		System.setProperty("Webdriver.edge.driver", "C:\\Users\\Viji\\eclipse-workspace\\jenijeni\\target\\driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		int temp =0;
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Redmi mobiles",Keys.ENTER);

		List<WebElement> elements2 = driver.findElements(By.xpath("//div[@class='_4rR01T']"));

		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

//		for(int j=elements.size()-1;j>=0;j--)
		for(int j=0;j<elements.size();j++)
		{

			WebElement webElement2 = elements2.get(j);

			WebElement webElement = elements.get(j);

			String text = webElement2.getText();

			String text1 = webElement.getText();

			

//			Map<String,String> m = new LinkedHashMap<String,String>();
//
//			m.put(text,text1);
//
//			for(Map.Entry<String, String> a :m.entrySet()) {
//
//				System.out.println(a);
//
//				}

			

			String s =text1.replaceAll("₹", "").replaceAll("," , "");

			int a = Integer.parseInt(s);

			temp =temp+a;
//			System.out.println("total : "+temp);

		}

	System.out.println("total : "+temp);

		}

}
	
