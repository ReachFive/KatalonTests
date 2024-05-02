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
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords

/**
 * Check if element present in timeout
 * @param to Katalon test object
 * @return true if element present, otherwise false
 */
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.ConsoleURL)

WebUI.setText(findTestObject('R5_console_Login/login_email'), GlobalVariable.Login_NME)

WebUI.setEncryptedText(findTestObject('R5_console_Login/login_password'), '5rdcrhgBYgE/1Hb7+0nwZQ==')

WebUI.click(findTestObject('R5_console_Login/button_Log in'))

WebUI.click(findTestObject('Object Repository/HP/Page_Console - ReachFive/div_Go to account'))

/*WebUI.setText(findTestObject('Object Repository/HP/Page_Console - ReachFive/input_Go to account_react-select-2-input'), 
    'nme')*/

WebUI.scrollToElement(findTestObject('HP/div_integ-qa-nme'), 3)

WebUI.click(findTestObject('HP/div_integ-qa-nme'))

WebUI.click(findTestObject('ProfilePageSearch/a_Profiles'))

WebUI.click(findTestObject('Object Repository/bin/Page_Console - ReachFive/input_Filter_Nr7Ji CVfQQ'))

WebUI.setText(findTestObject('ProfilePageSearch/SearchProfilFilter'), 'KatalonUserGenerale@gmail.com')

WebUI.click(findTestObject('Object Repository/ProfilePage/UserProfilImage'))

String RecentActivity = WebUI.getText(findTestObject('Object Repository/ProfilePage/div_Recent activity'))

if (RecentActivity.contains("Recent activity"))
	{
	//Mark Passed status after this step
	KeywordUtil.markPassed("Element is present")
	}
	else
	{
	//Mark Failed status after this step
	KeywordUtil.markFailed("Element is not present")
	}

WebUI.click(findTestObject('Object Repository/ProfilePage/span_Filters'))

String RecentActivityFilter = WebUI.getText(findTestObject('Object Repository/ProfilePage/p_Filters'))

if (RecentActivityFilter.contains("Filters"))
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

