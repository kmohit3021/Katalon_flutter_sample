import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import io.appium.java_client.AppiumDriver
import io.github.ashwith.flutter.FlutterFinder


RemoteWebDriver driver

String path = RunConfiguration.projectDir + '/App/app-counter.apk'

DesiredCapabilities capabilities = new DesiredCapabilities()

capabilities.setCapability('deviceName', 'emulator-5554')

capabilities.setCapability('platformName', 'Android')

capabilities.setCapability('automationName', 'Flutter')

capabilities.setCapability('noReset', 'true')

capabilities.setCapability('app', path)

//AppiumDriver<?> driver = MobileDriverFactory.getDriver(capabilities)
driver = new AppiumDriver<?>(new URL('http://0.0.0.0:4723'), capabilities)

FlutterFinder finder = new FlutterFinder(driver)

WebElement addTodoIconLocator = finder.byType('FloatingActionButton')


for(int i=0;i<10;i++) {
addTodoIconLocator.click()
}


WebElement text1 = finder.byText('Mohit, You have pushed the button this many times:')
String strtext1 = text1.getText()

println("Text value is: "+strtext1)


WebElement text2 = finder.byValueKey("CounterText")
String strtext2 = text2.getText()

println("Counter text is: "+strtext2)

WebElement text3 = finder.byValueKey("CounterNumber")
String strtext3 = text3.getText()

println("Counter number is: "+strtext3)

