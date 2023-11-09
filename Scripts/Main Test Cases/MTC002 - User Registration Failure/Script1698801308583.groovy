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

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Welcome  Online Banking/lkRegister'))

WebUI.setText(findTestObject('Object Repository/Page_ParaBank_Register_for_Free_Online_Account/txtFirstName'), firstName)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank_Register_for_Free_Online_Account/txtLastName'), lastName)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank_Register_for_Free_Online_Account/txtAddress'), address)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank_Register_for_Free_Online_Account/txtCity'), city)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank_Register_for_Free_Online_Account/txtState'), state)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank_Register_for_Free_Online_Account/txtZipCode'), zipCode)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank_Register_for_Free_Online_Account/txtPhoneNumber'), phone)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank_Register_for_Free_Online_Account/txtSSN'), ssn)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank_Register_for_Free_Online_Account/txtUsername'), username)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank_Register_for_Free_Online_Account/txtPassword'), password)

WebUI.setText(findTestObject('Object Repository/Page_ParaBank_Register_for_Free_Online_Account/txtRepeatedPassword'), password)

WebUI.click(findTestObject('Object Repository/Page_ParaBank_Register_for_Free_Online_Account/btnRegister'))

WebUI.verifyElementText(findTestObject('Page_ParaBank_Register_for_Free_Online_Account/lblAccountAlreadyExists'), GlobalVariable.expectedAccountAlreadyExistsMessage)

WebUI.takeScreenshotAsCheckpoint('UsernameAlreadyExists')

WebUI.closeBrowser()

