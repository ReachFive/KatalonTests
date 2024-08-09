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

WebUI.navigateToUrl(GlobalVariable.OaaS_Flow_URL)

WebUI.click(findTestObject('Object Repository/OaaS/Page_Authentication - QA-nme-katalon-testing/div_Log in'))

WebUI.verifyTextPresent('Log in', false)

attribute = WebUI.getAttribute(findTestObject('OaaS/Page_Authentication - QA-nme-katalon-testing/div_Log in_r5-social-buttons sc-fzplWN hNCuDX'), 
    'class')

System.out.println(attribute)

WebUI.verifyMatch(attribute, 'r5-social-buttons sc-fzplWN hNCuDX', true)

WebUI.verifyTextPresent('Do not have an account?', false)

WebUI.click(findTestObject('Object Repository/OaaS/Page_Authentication - QA-nme-katalon-testing/input_Email address or phone number_identifier'))

WebUI.setText(findTestObject('Object Repository/OaaS/Page_Authentication - QA-nme-katalon-testing/input_Email address or phone number_identifier'), 
    'katalon_OaaS_Flow@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OaaS/Page_Authentication - QA-nme-katalon-testing/input_Password_password'), 
    '5rdcrhgBYgE/1Hb7+0nwZQ==')


WebUI.click(findTestObject('Object Repository/OaaS/Page_Authentication - QA-nme-katalon-testing/button_Log in'))

WebUI.verifyTextPresent('Third Party Client needs your permission to access your QA-nme-katalon-testing account', false)

attribute2 = WebUI.getAttribute(findTestObject('Object Repository/OaaS/Page_Consents - QA-nme-katalon-testing/div_Accept            Deny'),
	'class')

System.out.println(attribute2)

WebUI.verifyMatch(attribute2, 'consentsButtons', true)

//WebUI.click(findTestObject('Object Repository/OaaS/Page_Consents - QA-nme-katalon-testing/p_Third Party Client needs your permission _c5b3f6'))

WebUI.click(findTestObject('Object Repository/OaaS/Page_Consents - QA-nme-katalon-testing/div_Accept            Deny'))

WebUI.click(findTestObject('Object Repository/OaaS/Page_Consents - QA-nme-katalon-testing/button_Accept_flow_OaaS_consent'))

WebUI.verifyTextPresent('Access Management', false)

WebUI.closeBrowser()

