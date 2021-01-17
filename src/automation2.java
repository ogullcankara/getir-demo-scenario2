import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class automation2 {

    public static MobileElement mobileElement;

    public static void main(String[] args) throws MalformedURLException {

        WebDriverWait wait;
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Huawei");
        dc.setCapability("udid", "2VN5T18807000602");
        dc.setCapability("platformVersion", "8.0.0");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.getir.casestudy.dev");
        dc.setCapability("appActivity", "com.getir.casestudy.modules.splash.ui.SplashActivity");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dc);


        wait = new WebDriverWait(ad, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.getir.casestudy.dev:id/iconImageView")));
        mobileElement = (MobileElement) ad.findElementById("com.getir.casestudy.dev:id/usernameEditText");
        mobileElement.sendKeys("hello@getir.com");
        mobileElement = (MobileElement) ad.findElementById("com.getir.casestudy.dev:id/passwordEditText");
        mobileElement.sendKeys("hello");
        mobileElement = (MobileElement) ad.findElementById("com.getir.casestudy.dev:id/loginButton");
        mobileElement.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.getir.casestudy.dev:id/ga_toolbar_getirLogoImageView")));
        mobileElement = (MobileElement) ad.findElementById("com.getir.casestudy.dev:id/ga_toolbar_getir10GABasketButton");
        mobileElement.click();

        mobileElement = (MobileElement) ad.findElementById("com.getir.casestudy.dev:id/ga_toolbar_leftIconImageView");
        mobileElement.click();
        mobileElement = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.TextView");
        mobileElement.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.getir.casestudy.dev:id/ga_toolbar_getir10TitleTextView")));
        mobileElement = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView");
        mobileElement.click();
        mobileElement = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView[2]");
        mobileElement.click();
        mobileElement = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView");
        mobileElement.click();
        mobileElement = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView[2]");
        mobileElement.click();
        mobileElement = (MobileElement) ad.findElementById("com.getir.casestudy.dev:id/ga_toolbar_leftIconImageView");
        mobileElement.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.getir.casestudy.dev:id/ga_toolbar_getirLogoImageView")));
        mobileElement = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.widget.TextView");
        mobileElement.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.getir.casestudy.dev:id/ga_toolbar_getir10TitleTextView")));
        mobileElement = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView");
        mobileElement.click();
        mobileElement = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView[2]");
        mobileElement.click();
        mobileElement = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView[2]");
        mobileElement.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.getir.casestudy.dev:id/ga_toolbar_getir10TitleTextView")));
        mobileElement = (MobileElement) ad.findElementById("com.getir.casestudy.dev:id/ga_toolbar_getir10GABasketButton");
        mobileElement.click();
        mobileElement = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView[2]");
        mobileElement.click();
        mobileElement = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView[2]");
        mobileElement.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.getir.casestudy.dev:id/ga_toolbar_getir10TitleTextView")));
        mobileElement = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView[1]");
        mobileElement.click();
        mobileElement = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView[1]");
        mobileElement.click();
        mobileElement = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView[1]");
        mobileElement.click();
        mobileElement = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView[1]");
        mobileElement.click();
        mobileElement = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView[1]");
        mobileElement.click();
        mobileElement = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView[1]");
        mobileElement.click();
        mobileElement = (MobileElement) ad.findElementById("com.getir.casestudy.dev:id/btnRemove");
        mobileElement.click();
        mobileElement = (MobileElement) ad.findElementById("com.getir.casestudy.dev:id/btnRemove");
        mobileElement.click();
        mobileElement = (MobileElement) ad.findElementById("com.getir.casestudy.dev:id/btnRemove");
        mobileElement.click();




    }

}
