import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://2023071308.cypress-asp-gke-rba-pos.dev.aidencloud.eu/#/')

WebUI.setText(findTestObject('Object Repository/Flutter_Web/Page_Aiden Cloud User Portal/input_Retail Flutter Pos Client_Input.Organization'), 
    'C01')

WebUI.setText(findTestObject('Object Repository/Flutter_Web/Page_Aiden Cloud User Portal/input_Organization_Input.Username'), 
    'katalon')

WebUI.setEncryptedText(findTestObject('Object Repository/Flutter_Web/Page_Aiden Cloud User Portal/input_Username_Input.Password'), 
    'xSEXy/5U3tx8KW40H+YXew==')

WebUI.click(findTestObject('Object Repository/Flutter_Web/Page_Aiden Cloud User Portal/button_Login'))

WebUI.click(findTestObject('Object Repository/Flutter_Web/Page_Retail by Aiden/flt-semantics_Additional functions-ss-pane-589'))

WebUI.click(findTestObject('Object Repository/Flutter_Web/Page_Retail by Aiden/flt-semantics_Customer-ss-pane-695'))

WebUI.verifyElementText(findTestObject('Object Repository/Flutter_Web/Page_Retail by Aiden/flt-semantics_Citaverde College RoermondK15_eabeed'), 
    '!Citaverde College Roermond\nK157309\nBusiness: Yes\nVAT: \nEchterstraat 16 \n6102 ET Echt\nNL\nn/a', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Flutter_Web/Page_Retail by Aiden/flt-semantics_Citaverde College RoermondK15_eabeed'))

WebUI.click(findTestObject('Object Repository/Flutter_Web/Page_Retail by Aiden/flt-semantics_Resume-ss-pane-d08'))

WebUI.click(findTestObject('Object Repository/Flutter_Web/Page_Retail by Aiden/flt-semantics_Paused Transaction-ss-pane-fcb'))

WebUI.click(findTestObject('Object Repository/Flutter_Web/Page_Retail by Aiden/flt-semanticsflt-semantic-node-236-ss-pane-a16'))

WebUI.setText(findTestObject('Object Repository/Flutter_Web/Page_Retail by Aiden/input-ss-pane-930'), 'mohit.kumar@katalon.com')

WebUI.click(findTestObject('Object Repository/Flutter_Web/Page_Retail by Aiden/flt-semantics_Continue-ss-pane-d1a'))

