import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import io.appium.java_client.AppiumDriver
import io.github.ashwith.flutter.FlutterFinder


RemoteWebDriver driver

String path = RunConfiguration.projectDir + '/App/app-items.apk'

DesiredCapabilities capabilities = new DesiredCapabilities()

capabilities.setCapability('deviceName', 'emulator-5554')

capabilities.setCapability('platformName', 'Android')

capabilities.setCapability('automationName', 'Flutter')

capabilities.setCapability('noReset', 'true')

capabilities.setCapability('app', path)

//AppiumDriver<?> driver = MobileDriverFactory.getDriver(capabilities)
driver = new AppiumDriver<?>(new URL('http://0.0.0.0:4723'), capabilities)

FlutterFinder finder = new FlutterFinder(driver)

WebElement type1 = finder.byValueKey("text_5")
String text1 = type1.getText()

println("text is: "+text1)

finder.byValueKey("icon_5").click()

Mobile.delay(2)
finder.byText("Favorites").click()
Mobile.delay(2)

WebElement textFav = finder.byValueKey("favorites_text_5")
String strFav = textFav.getText()
println(strFav)

finder.byValueKey("remove_icon_5").click()
Mobile.delay(2)

WebElement textNoFav = finder.byText("No favorites added.")
String strNoFav = textNoFav.getText()
println(strNoFav)





