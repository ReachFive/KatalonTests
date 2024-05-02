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

WebUI.setText(findTestObject('Object Repository/R5_console_Login/login_email'), 'nawel.mele@reach5.co')

WebUI.setEncryptedText(findTestObject('Object Repository/R5_console_Login/login_password'), '5rdcrhgBYgE/1Hb7+0nwZQ==')

WebUI.click(findTestObject('Object Repository/R5_console_Login/button_Log in'))

WebUI.closeBrowser()

