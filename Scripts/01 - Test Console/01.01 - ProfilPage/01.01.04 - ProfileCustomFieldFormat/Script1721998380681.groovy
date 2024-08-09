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

WebUI.setText(findTestObject('R5_console_Login/login_email'), GlobalVariable.Login_NME)

WebUI.setEncryptedText(findTestObject('R5_console_Login/login_password'), '5rdcrhgBYgE/1Hb7+0nwZQ==')

WebUI.click(findTestObject('R5_console_Login/button_Log in'))

WebUI.click(findTestObject('Object Repository/HP/Page_Console - ReachFive/div_Go to account'))

/*WebUI.setText(findTestObject('Object Repository/HP/Page_Console - ReachFive/input_Go to account_react-select-2-input'), 
    'nme')*/
WebUI.scrollToElement(findTestObject('HP/div_integ-qa-nme'), 3)

WebUI.click(findTestObject('HP/div_integ-qa-nme'))

WebUI.click(findTestObject('ProfilePageSearch/a_Profiles'))

WebUI.click(findTestObject('Object Repository/ProfilePageSearch/Profile_boxe_search'))

WebUI.setText(findTestObject('ProfilePageSearch/SearchProfilFilter'), 'katalon_custom_field@gmail.com')

WebUI.delay(5)

WebUI.verifyTextPresent('katalon_custom_field@gmail.com', false)

WebUI.click(findTestObject('Object Repository/ProfilePage/UserProfilImage'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/bin/Page_Console - ReachFive/span_Actions'))

WebUI.click(findTestObject('Object Repository/bin/Page_Console - ReachFive/span_Edit'))

WebUI.click(findTestObject('Object Repository/bin/Page_Console - ReachFive/div_Custom fields'))

WebUI.setText(findTestObject('Object Repository/bin/Page_Console - ReachFive/input_snake_case_Nr7Ji'), 'test_modify')

WebUI.click(findTestObject('Object Repository/bin/Page_Console - ReachFive/span_Save'))

WebUI.click(findTestObject('Object Repository/bin/Page_Console - ReachFive/div_Save successful'))

String SaveSuccess = WebUI.getText(findTestObject('Object Repository/bin/Page_Console - ReachFive/div_Save successful'))

println(SaveSuccess)
println(SaveSuccess.getClass())
println(SaveSuccess.length())

if (SaveSuccess.contains('Save successful')) {
	//Mark Passed status after this step
	KeywordUtil.markPassed('Element is present' //Mark Failed status after this step
		)
} else {
	KeywordUtil.markFailed('Element is not present')
}

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/bin/Page_Console - ReachFive/span_Actions'))

WebUI.click(findTestObject('Object Repository/bin/Page_Console - ReachFive/button_Edit'))

WebUI.click(findTestObject('Object Repository/bin/Page_Console - ReachFive/div_Custom fields'))

WebUI.setText(findTestObject('Object Repository/bin/Page_Console - ReachFive/input_snake_case_Nr7Ji'), 'test_modify2')

WebUI.click(findTestObject('Object Repository/bin/Page_Console - ReachFive/span_Save'))

WebUI.click(findTestObject('Object Repository/bin/Page_Console - ReachFive/div_Save successful'))

WebUI.click(findTestObject('Object Repository/bin/Page_Console - ReachFive/span_Actions'))

WebUI.click(findTestObject('Object Repository/bin/Page_Console - ReachFive/button_Edit'))

WebUI.click(findTestObject('Object Repository/bin/Page_Console - ReachFive/div_Custom fields'))

WebUI.setText(findTestObject('Object Repository/bin/Page_Console - ReachFive/input_snake_case_Nr7Ji'), 'test')

WebUI.click(findTestObject('Object Repository/bin/Page_Console - ReachFive/span_Save'))

WebUI.click(findTestObject('Object Repository/bin/Page_Console - ReachFive/div_Save successful'))

WebUI.closeBrowser()


