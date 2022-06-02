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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL_GESCON)

WebUI.setText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_UserName'), '13812477-0')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_Password'), 'Pkt3zEbEao0OXfOgHMaviw==')

WebUI.click(findTestObject('Object Repository/Page_Iniciar sesin/span_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/Page_Sistema de Gestin de Contratos/div_Administracin'))

WebUI.click(findTestObject('Object Repository/Page_Sistema de Gestin de Contratos/li_Parmetros del Sistema'))

WebUI.click(findTestObject('Object Repository/Page_Sistema de Gestin de Contratos/li_Usuarios'))

WebUI.setText(findTestObject('Object Repository/Page_Listar Usuarios/input_Nombres_ctl00ContentPlaceHolder1txtNombres'), 
    'Usuario De Prueba')

WebUI.click(findTestObject('Object Repository/Page_Listar Usuarios/input_Nombres_ctl00ContentPlaceHolder1btnBuscar'))

WebUI.verifyElementText(findTestObject('Page_Listar Usuarios/td_2222222'), '2222222')

WebUI.verifyElementText(findTestObject('Page_Listar Usuarios/td_De'), 'De')

WebUI.verifyElementText(findTestObject('Page_Listar Usuarios/td_Prueba'), 'Prueba')

WebUI.verifyElementText(findTestObject('Page_Listar Usuarios/td_Usuario'), 'Usuario')

WebUI.delay(20)

WebUI.closeBrowser()

