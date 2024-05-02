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

WebUI.navigateToUrl(GlobalVariable.ConsoleURL)

WebUI.setText(findTestObject('Object Repository/Login/input_Email address or phone number_identifier'), GlobalVariable.Login_NME)

WebUI.setEncryptedText(findTestObject('Object Repository/Login/input_Password_password'), '5rdcrhgBYgE/1Hb7+0nwZQ==')

WebUI.click(findTestObject('Object Repository/Login/button_Log in'))

WebUI.click(findTestObject('Object Repository/ProfilePage/div_Go to account_css-8yile7-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/HP/div_Integ-QA-fonctionnelle'))

WebUI.click(findTestObject('Object Repository/ProfilePage/span_Profiles'))

WebUI.verifyTextPresent('K profiles', true)

WebUI.verifyTextPresent('Filter', false)

WebUI.verifyTextPresent('Identifier', false)

WebUI.closeBrowser()

