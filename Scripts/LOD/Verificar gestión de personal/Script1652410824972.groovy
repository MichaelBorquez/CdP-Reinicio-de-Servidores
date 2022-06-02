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

WebUI.navigateToUrl('http://galena.aguasnuevas.cl/Account/Login?errorADFS=False')

WebUI.click(findTestObject('Object Repository/Page_GALENA/button_Usuario Contratista'))

WebUI.setText(findTestObject('Object Repository/Page_GALENA/input_Usuario_Usuario'), 'csalazar@morrisopazo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_GALENA/input_Contrasea_Password'), 'r+ipeKXHX4UvOfNToqOjEA==')

WebUI.click(findTestObject('Object Repository/Page_GALENA/button_Iniciar Sesin'))

WebUI.click(findTestObject('Object Repository/Page_GALENA  Administracin y Seguimientos d_202c27/i_Logout_pe-7s-keypad'))

WebUI.click(findTestObject('Object Repository/Page_GALENA  Administracin y Seguimientos d_202c27/i_Evaluador Estndar_pe pe-7s-users text-info pe-2x'))

WebUI.switchToWindowTitle('GALENA | Nómina del Personal')

WebUI.setText(findTestObject('Object Repository/Page_GALENA  Nmina del Personal/input_Filtro y bsqueda_searchInput'), 'Usuario')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_GALENA  Nmina del Personal/td_2.222.222-8'), '2.222.222-8')

WebUI.verifyElementText(findTestObject('Page_GALENA  Nmina del Personal/td_Usuario'), 'Usuario')

WebUI.verifyElementText(findTestObject('Page_GALENA  Nmina del Personal/td_De Prueba'), 'De Prueba')

WebUI.delay(20)

WebUI.closeBrowser()

