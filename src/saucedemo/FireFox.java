package saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

    public static void main(String[] args) {
        FireFox fi = new FireFox();
        fi.firefox();


    }
    public  void firefox(){
        String baseUrl ="https://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver" , "dirver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();

    }

}
