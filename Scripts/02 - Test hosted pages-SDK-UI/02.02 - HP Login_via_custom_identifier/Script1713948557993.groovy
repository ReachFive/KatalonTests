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

WebUI.navigateToUrl('https://console-integ.reach5.co/login?r5_request_token=m6cOE6zd9-BXdE0nyn9CkfVU4zQ_V6Z4OC07igkYky8Zy5hzntuKiMsxzaEv6Uscw3jc-tDHr7oqq8qM9Cjdxj2oe5ZhyxjUxU0xLbN-jeV8y69Nt2Y_7MM0_2-Nudfz16XfETAzvX5coTThURFh4xNgA8H9AnZK-5_6MMH-kNWpmWgJNxL8Hx_irJqt1Y1Q4WNjOcYe8JoN4iphXkMySBUZkMIvCfeIJkb76TLrjDcOwiqSQGobrO1FUQxkmVpl1ns0_FrF9TnIIeJOHXCdVjnkUFRvCbXJcwp1H648IrHZxLthwxFldqkTG64fVLpLwSTCD0qwm10IN4nJDIW1hso0iJKVhqPJQbWVVPuqjE0Cjyic9fggsR5NOgd41twP')

WebUI.setText(findTestObject('R5_console_Login/login_email'), GlobalVariable.Login_NME)

WebUI.setEncryptedText(findTestObject('R5_console_Login/login_password'), '5rdcrhgBYgE/1Hb7+0nwZQ==')

WebUI.click(findTestObject('R5_console_Login/button_Log in'))

WebUI.click(findTestObject('Object Repository/HP/Page_Console - ReachFive/div_Go to account'))

/*WebUI.setText(findTestObject('Object Repository/HP/Page_Console - ReachFive/input_Go to account_react-select-2-input'), 
    'nme')*/

WebUI.scrollToElement(findTestObject('HP/div_integ-qa-nme'), 3)

WebUI.click(findTestObject('HP/div_integ-qa-nme'))

WebUI.click(findTestObject('Object Repository/HP/Page_Console - ReachFive/a_Settings'))

WebUI.click(findTestObject('Object Repository/HP/Page_Console - ReachFive/span_Hosted Pages'))

WebUI.click(findTestObject('Object Repository/HP/Page_Console - ReachFive/div_Authentication'))

WebUI.click(findTestObject('Object Repository/HP/Page_Console - ReachFive/a_httpsinteg-qa-nme.reach5.netauth'))

WebUI.switchToWindowUrl('https://integ-qa-nme.reach5.net/auth')

test = findTestObject('HP/Page_Authentication - QA-nme-katalon-testing/input_or_customIdentifier')

type = test.getClass()

attribute = WebUI.getAttribute(findTestObject('HP/Page_Authentication - QA-nme-katalon-testing/input_or_customIdentifier'), 
    'name')

System.out.println(attribute)

WebUI.verifyMatch(attribute, 'customIdentifier', true)

WebUI.click(findTestObject('Object Repository/HP/Page_Authentication - QA-nme-katalon-testing/input_or_customIdentifier'))

WebUI.setText(findTestObject('Object Repository/HP/Page_Authentication - QA-nme-katalon-testing/input_or_customIdentifier'), 
    GlobalVariable.Custom_identifier_user)

WebUI.setEncryptedText(findTestObject('Object Repository/HP/Page_Authentication - QA-nme-katalon-testing/input_Password_Hp_Login_with_Custom_identifier'), 
    'mvMLieaRys6G2VpqDO/r4Q==')

WebUI.click(findTestObject('Object Repository/HP/Page_Authentication - QA-nme-katalon-testing/button_Log in_HP_Login'))

WebUI.click(findTestObject('Object Repository/HP/Page_Welcome to ReachFive  Customer Identit_fd61a9/a_Accept'))

WebUI.verifyTextPresent('Access Management', false)

WebUI.closeBrowser()

