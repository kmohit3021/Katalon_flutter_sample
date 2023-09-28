import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

Mobile.startApplication('/Users/mohit/Katalon Studio/katalon_flutter_sample/App/app-counter.apk', true)

for (def index : (0..9)) {
    Mobile.tap(findTestObject('Object Repository/Flutter/app-debug2_apk/android.widget.Button'), 0)
}

String text1 = Mobile.getAttribute(findTestObject('Object Repository/Flutter/app-debug2_apk/android.view.View'), 'content-desc', 
    10)

println('Counter text:- ' + text1)

String text2 = Mobile.getAttribute(findTestObject('Object Repository/Flutter/app-debug2_apk/android.view.View (1)'), 'content-desc', 
    10)

println('Counter Number:- ' + text2)

Mobile.closeApplication()

