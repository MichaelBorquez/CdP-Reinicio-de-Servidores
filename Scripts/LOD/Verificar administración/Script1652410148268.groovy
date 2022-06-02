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

WebUI.click(findTestObject('Object Repository/Page_GALENA  Administracin y Seguimientos d_202c27/a_ADMINISTRACIN'))

WebUI.click(findTestObject('Page_GALENA  Administracin y Seguimientos de Proyectos/a_Nueva Atacama'))

WebUI.verifyElementText(findTestObject('Page_GALENA  Administracin y Seguimientos d_202c27/a_Aguas Araucana'), 'Aguas Araucanía')

WebUI.verifyElementText(findTestObject('Page_GALENA  Administracin y Seguimientos d_202c27/a_Departamento Informtica'), 
    'Departamento Informática')

WebUI.verifyElementText(findTestObject('Page_GALENA  Administracin y Seguimientos d_202c27/a_Gerencia Clientes'), 'Gerencia Clientes')

WebUI.delay(20)

WebUI.closeBrowser()

