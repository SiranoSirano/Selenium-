package seleniumSample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class 社員情報システムログイン {
	@Test
	public void testGoogleSearch() throws InterruptedException {
		// Optional, if not specified, WebDriver will search your path for chromedriver.
		System.setProperty("webdriver.chrome.driver", "exe/chromedriver.exe");

		// ブラウザ(Firefox)を起動
		WebDriver driver = new ChromeDriver();

		// URLを開く
		driver.get("http://192.168.1.4:8080/社員情報管理システムDB接続/index.jsp");
		Thread.sleep(5000); // Let the user actually see something!
		WebElement searchBox = driver.findElement(By.name("q"));


		// ユーザー名入力
		driver.findElement(By.name("username")).sendKeys("フォームに打ち込むユーザー名");

		// パスワード入力
		driver.findElement(By.name("pass")).sendKeys("フォームに打ち込むパスワード");

		// ログインボタンを押す


		driver.findElement(By.name("ログイン")).sendKeys(Keys.ENTER);
		Thread.sleep(5000); // Let the user actually see something!
		driver.quit();

	}
}