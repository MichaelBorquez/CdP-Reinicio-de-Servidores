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

WebUI.navigateToUrl(GlobalVariable.URL_SoftExpert)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_SESuite 2.1/div_Autenticacin integrada'))

if(WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_UserName'), 8)==false) {
	WebUI.closeBrowser()
}

WebUI.setText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_UserName'), GlobalVariable.User1)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_Password'), GlobalVariable.Password1Encrypted)

WebUI.click(findTestObject('Object Repository/Page_Iniciar sesin/span_Iniciar sesin'))

WebUI.verifyElementText(findTestObject('Page_PortalHome/span_tems del men - Men de Consultas'), 'Ítems del menú - Menú de Consultas')

WebUI.closeBrowser()

