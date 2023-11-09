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

WebUI.callTestCase(findTestCase('Reusable Test Cases/Open the webapp'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Welcome  Online Banking/lkForgotLoginInfo'))

WebUI.setText(findTestObject('Object Repository/Page_ParaBank_Customer_Lookup/txtFirstName'), firstName)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank_Customer_Lookup/txtLastName'), lastName)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank_Customer_Lookup/txtAddress.street'), address)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank_Customer_Lookup/txtAddress.city'), city)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank_Customer_Lookup/txtAddress.state'), state)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank_Customer_Lookup/txtAddress.zipCode'), zipCode)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank_Customer_Lookup/txtSSN'), ssn)

WebUI.click(findTestObject('Object Repository/Page_ParaBank_Customer_Lookup/btnFindMyLoginInfo'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_ParaBank_Customer_Lookup/h1CustomerLookup'), GlobalVariable.expectedCustomerLookupText)

WebUI.verifyElementText(findTestObject('Object Repository/Page_ParaBank_Customer_Lookup/lblLoginInfoLookUpSuccess'), GlobalVariable.expectedLoginInfoLookupSuccessMessage)

WebUI.closeBrowser()

