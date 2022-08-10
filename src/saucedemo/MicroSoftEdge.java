package saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicroSoftEdge {
    public static void main(String[] args) {
        MicroSoftEdge ed = new MicroSoftEdge();
        ed.microsoftedge();

    }
    public  void microsoftedge() {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver", "dirver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();

    }
    }

