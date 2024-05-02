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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.ConsoleURL)

WebUI.setText(findTestObject('R5_console_Login/login_email'), GlobalVariable.Login_NME)

WebUI.setEncryptedText(findTestObject('R5_console_Login/login_password'), '5rdcrhgBYgE/1Hb7+0nwZQ==')

WebUI.click(findTestObject('Object Repository/Login/button_Log in'))

WebUI.click(findTestObject('Object Repository/ProfilePage/div_Go to account_css-8yile7-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/HP/div_Integ-QA-fonctionnelle'))

WebUI.click(findTestObject('Object Repository/ProfilePage/span_Profiles'))

WebUI.setText(findTestObject('Object Repository/ProfilePageSearch/SearchProfilFilter'), 'mele')

WebUI.delay(10)

result = WebUI.getText(findTestObject('ProfilePageSearch/div_IdentifierGenderNameAgeCityAuthenticati_59a7fa'))

println(result)

println(result.getClass())

result.eachLine({ 
        if (it =~ 'Groovy') {
            println(it // Output: Groovy is closely related to Java,
                )
        }
    })

list = result.readLines()

assert list instanceof ArrayList

println(list.size())

WebUI.closeBrowser()

