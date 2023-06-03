package practice.day01;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Odev2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        System.out.println("Sayfanin Basligi = " + driver.getTitle());
        System.out.println("Sayfanin Url`si = " + driver.getCurrentUrl());

        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        String actualTitle = driver.getTitle();
        String expectedTitle = "Teknoloji";
        if(actualTitle.contains("Teknoloji")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl ="teknosa";
        if(actualUrl.contains("teknosa")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        System.out.println("Sayfa Basligi Medunna = " + driver.getTitle());
        System.out.println("Sayfa Url`si Medunna = " + driver.getCurrentUrl());

        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "MEDUNNA";
        if(actualTitle.contains("MEDUNNA")){
            System.out.println("Test Medunna PASSED");
        }else System.out.println("Test Medunna FAILED");

        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        String actualUrl1 = driver.getCurrentUrl();
        String expectedUrl1 ="teknosa";
        if(actualUrl.contains("teknosa")){
            System.out.println("Test Medunna1 PASSED");
        }else System.out.println("Test Medunna1 FAILED");

        // teknosa adresine geri donunuz
        driver.navigate().back();
        Thread.sleep(1000);

        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(1000);

        // medunna adresine ilerleyiniz
        driver.navigate().forward();
        Thread.sleep(1000);

        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(1000);

        // pencereyi kapat
        driver.close();

    }
}