package seleniumSample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class 社員情報システムログイン {

	@Test
	public void test社員情報システムログイン() throws InterruptedException {
		// Optional, if not specified, WebDriver will search your path for chromedriver.
		System.setProperty("webdriver.chrome.driver", "exe/chromedriver.exe");
		// ブラウザを起動
		WebDriver driver = new ChromeDriver();
		try {

			// URLを開く
			driver.get("http://192.168.1.4:8080/社員情報管理システムDB接続/index.jsp");
			Thread.sleep(1000); // Let the user actually see something!

			// ユーザー名入力
			driver.findElement(By.name("userName")).sendKeys("フォームに打ち込むユーザー名");

			// パスワード入力
			driver.findElement(By.name("pass")).sendKeys("フォームに打ち込むパスワード");

			// ログインボタンを押す

			// Enter text "q" and perform keyboard action "Enter"
			driver.findElement(By.name("ログイン")).sendKeys("ログイン" + Keys.ENTER);
			driver.findElement(By.name("ログイン")).submit();
			driver.findElement(By.name("ログイン")).click();
			Thread.sleep(5000); // Let the user actually see something!
		} finally {
			driver.quit();
		}
	}
}