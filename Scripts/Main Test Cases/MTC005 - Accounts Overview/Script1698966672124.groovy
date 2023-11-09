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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as Keys

WebUI.callTestCase(findTestCase('Reusable Test Cases/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//List<WebElement> accounts = WebUI.findWebElements(findTestObject('Object Repository/Page_ParaBank  Accounts Overview/lkAccount'), 3)

//int n = accounts.size()

//for (def index : (0..n)) {
	//String lkAccount = WebUI.getText(accounts.get(index))
    String lkAccount = WebUI.getText(findTestObject('Object Repository/Page_ParaBank  Accounts Overview/lkAccount'))

    String balance = WebUI.getText(findTestObject('Object Repository/Page_ParaBank  Accounts Overview/lblBalance'))

    String availableAmount = WebUI.getText(findTestObject('Object Repository/Page_ParaBank  Accounts Overview/lblAvailableAmount'))

    WebUI.click(findTestObject('Object Repository/Page_ParaBank  Accounts Overview/lkAccount'))

    WebUI.verifyElementText(findTestObject('Object Repository/Page_ParaBank  Account Activity/lblAccountNumber'), lkAccount)

    WebUI.verifyElementText(findTestObject('Object Repository/Page_ParaBank  Account Activity/lblBalance'), balance)

    WebUI.verifyElementText(findTestObject('Object Repository/Page_ParaBank  Account Activity/lblAvailable'), availableAmount)

    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ParaBank  Account Activity/AccountActivityFilters'), 
        0)

    //WebUI.back()
//}

WebUI.closeBrowser()

