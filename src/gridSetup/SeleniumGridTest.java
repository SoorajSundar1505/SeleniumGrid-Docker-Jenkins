package gridSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridTest {
    private WebDriver driver;
    private String hubUrl = "http://localhost:4444/wd/hub"; 
    String seleniumServerPath = "selenium-server-4.13.0.jar";

    @BeforeSuite
    public void setUp() throws IOException, InterruptedException {
    	
    	
    	 // Replace with the actual path
    	
//    	ProcessBuilder processBuilder = new ProcessBuilder("java", "-jar", seleniumServerPath, "standalone");
//    	processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
//        processBuilder.redirectError(ProcessBuilder.Redirect.INHERIT);
//        process = processBuilder.start();
    	
    	

    	
    	
    	ChromeOptions chrome = new ChromeOptions();
//    	FirefoxOptions firefox = new FirefoxOptions();
        driver = new RemoteWebDriver(new URL(hubUrl), chrome);
    }

    @Test
    public void testExample() throws MalformedURLException {
        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
    
  
}
