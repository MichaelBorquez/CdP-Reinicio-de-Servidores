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

WebUI.navigateToUrl(GlobalVariable.URL_SRT)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_UserName'), GlobalVariable.User1)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_Password'), GlobalVariable.Password1Encrypted)

WebUI.click(findTestObject('Object Repository/Page_Iniciar sesin/span_Iniciar sesin'))

WebUI.delay(4)

WebUI.navigateToUrl(GlobalVariable.URL_SRT)

WebUI.delay(4)

WebUI.navigateToUrl(GlobalVariable.URL_SRT)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_SRT/button_Aguas del Altiplano'), 15)

WebUI.click(findTestObject('Object Repository/Page_SRT/button_Aguas del Altiplano'))

WebUI.click(findTestObject('Page_SRT/div_Distribucin1'))

WebUI.click(findTestObject('Page_SRT/div_Reporte1'))

WebUI.click(findTestObject('Page_SRT/span_RDI5 - CONSUMO AP'))

WebUI.click(findTestObject('Object Repository/Page_SRT/div_Zonas'))

WebUI.click(findTestObject('Object Repository/Page_SRT/span_Alto Hospicio'))

WebUI.click(findTestObject('Object Repository/Page_SRT/span_Actualizar Tabla'))

T1 = WebUI.getText(findTestObject('Object Repository/Page_SRT/td_170.25'))

WebUI.verifyNotEqual(T1, 0)

WebUI.closeBrowser()

