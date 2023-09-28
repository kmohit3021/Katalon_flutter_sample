import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

Mobile.startExistingApplication('com.android.vending')

Mobile.tap(findTestObject('Object Repository/OR Scroll/android.widget.Button (1)'), 10)

Mobile.setText(findTestObject('Object Repository/OR Scroll/android.widget.EditText (1)'), 'amazon app', 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/OR Scroll/android.view.View (1)'), 10)

Mobile.verifyElementText(findTestObject('Object Repository/OR Scroll/android.widget.TextView - Related to your search (1)'), 
    'Related to your search')

//Mobile.swipe(600, 1403, 200, 1403)
CustomKeywords.'mobileKeywordss.Scroll.horizontalScroll'(findTestObject('Object Repository/OR Scroll/android.view.View-scrollable'), 
    findTestObject('Object Repository/OR Scroll/android.view.View-iHerb'))

Mobile.tap(findTestObject('Object Repository/OR Scroll/android.view.View-iHerb'), 10)

Mobile.delay(2)

