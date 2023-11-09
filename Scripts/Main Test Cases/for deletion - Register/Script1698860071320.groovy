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

WebUI.callTestCase(findTestCase('Reusable Test Cases/Open the webapp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Main Test Cases/MTC001 - User Registration'), [('firstName') : 'John', ('lastName') : 'Doe'
        , ('address') : '123 Dublin Dr', ('city') : 'Lake Mary', ('state') : 'Florida', ('zipCode') : '32746', ('phone') : '123-456-7890'
        , ('ssn') : '123-45-6789', ('username') : 'Jdoe', ('password') : 'Password'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_ParaBank_Customer_Created/lblWelcome'), GlobalVariable.expectedWelcomeMessage + 
    GlobalVariable.username)

WebUI.verifyElementText(findTestObject('Object Repository/Page_ParaBank_Customer_Created/lblSuccessfulAccountCreation'), 
    GlobalVariable.expectedSuccessfulAccountCreationMessage)

WebUI.closeBrowser()

