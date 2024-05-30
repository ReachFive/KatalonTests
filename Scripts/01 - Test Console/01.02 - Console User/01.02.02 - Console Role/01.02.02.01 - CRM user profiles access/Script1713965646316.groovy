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

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

/**
 * Check if element present in timeout
 * @param to Katalon test object
 * @return true if element present, otherwise false
 */

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.ConsoleURL)

WebUI.setText(findTestObject('R5_console_Login/login_email'), GlobalVariable.LoginCRMUser)

WebUI.setEncryptedText(findTestObject('R5_console_Login/login_password'), '5rdcrhgBYgE/1Hb7+0nwZQ==')

WebUI.click(findTestObject('R5_console_Login/button_Log in'))

WebUI.click(findTestObject('ProfilePageSearch/a_Profiles'))

WebUI.click(findTestObject('Object Repository/ProfilePageSearch/Profile_boxe_search'))

WebUI.setText(findTestObject('ProfilePageSearch/SearchProfilFilter'), 'User_Role_tests@gmail.com')

WebUI.click(findTestObject('Object Repository/ProfilePage/UserProfilImage'))

WebUI.click(findTestObject('Object Repository/ProfilePage/ActionButtonProfilEdition'))

WebUI.click(findTestObject('Object Repository/ProfilePage/button_Edit'))

String ProfileEditionTitle = WebUI.getText(findTestObject('Object Repository/ProfilePage/UseProfileEditionTitle'))

if (ProfileEditionTitle.contains("Edition of profile"))
	{
	//Mark Passed status after this step
	KeywordUtil.markPassed("Element is present")
	}
	else
	{
	//Mark Failed status after this step
	KeywordUtil.markFailed("Element is not present")
	}


WebUI.closeBrowser()

