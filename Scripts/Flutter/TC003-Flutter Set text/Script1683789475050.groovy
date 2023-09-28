import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import io.appium.java_client.AppiumDriver
import io.github.ashwith.flutter.FlutterFinder


RemoteWebDriver driver

String path = RunConfiguration.projectDir + '/App/app-settext.apk'

DesiredCapabilities capabilities = new DesiredCapabilities()

capabilities.setCapability('deviceName', 'emulator-5554')

capabilities.setCapability('platformName', 'Android')

capabilities.setCapability('automationName', 'Flutter')

//capabilities.setCapability("appPackage", "com.sankhla.knowledgewood");

//capabilities.setCapability("appActivity", "com.sankhla.knowledgewood.MainActivity");

capabilities.setCapability('noReset', 'true')

capabilities.setCapability('app', path)

//AppiumDriver<?> driver = MobileDriverFactory.getDriver(capabilities)
driver = new AppiumDriver<?>(new URL('http://0.0.0.0:4723'), capabilities)

FlutterFinder finder = new FlutterFinder(driver)

Mobile.delay(5)

WebElement type1 = finder.bySemanticsLabel("email")
String text1 = type1.sendKeys("Mohit Kumar")
Mobile.delay(2)

WebElement type2 = finder.bySemanticsLabel("password")
String text2 = type2.sendKeys("Kumar")
Mobile.delay(2)

