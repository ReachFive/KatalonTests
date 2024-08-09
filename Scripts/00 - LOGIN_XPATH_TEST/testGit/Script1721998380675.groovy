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

WebUI.navigateToUrl('https://integ-qa-nme.reach5.net/auth?redirectUri=https%3A%2F%2Finteg-qa-nme.reach5.net%2Foauth%2Fauthorize%2Fcallback&state=Rw968TgwArjAsRAqX2xy1x2cTVqV4Whsz0FUkblUDTb8g0LAm1eMgXAE1MOFC2AdaEBw84pUxdeoNW30hoEAlYAFcDU7PsPZ6u7E1C-uWV7zbszgwnon2pXe8IkV1SMSxQGgdoISGGRQfvywamEo0f6I2IFAbuX4aKkRVktAsWskyIY_2hMSJWyxf09hHcTa_wRD4IbvDreWtO3lJGOHkCTy8pM8FWBNSUQqJPtz3b4')

WebUI.click(findTestObject('Object Repository/OaaS/Page_Authentication - QA-nme-katalon-testing/div_Log in_r5-social-buttons sc-fzplWN hNCuDX'))

WebUI.click(findTestObject('Object Repository/OaaS/Page_Authentication - QA-nme-katalon-testing/span_Do not have an account'))

WebUI.closeBrowser()

