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

WebUI.navigateToUrl('http://ohio:1000/Login.aspx?ReturnUrl=%2fdefault.aspx')

WebUI.setText(findTestObject('Object Repository/Page_Bienvenido al Sistema de Produccin y D_470a8a/input_Usuario_txtUser'), 
    '2222222-8')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bienvenido al Sistema de Produccin y D_470a8a/input_Password_txtPassword'), 
    'aU/kf7hTpyQ=')

WebUI.click(findTestObject('Object Repository/Page_Bienvenido al Sistema de Produccin y D_470a8a/input_Ingrese Password_btnLogin'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Bienvenido al Sistema de Produccin y D_470a8a/td_Equipos'))

WebUI.click(findTestObject('Page_Bienvenido al Sistema de Produccin y Depuracin/td_Listar1'))

WebUI.click(findTestObject('Object Repository/Page_Listar Equipos/input_Activo_ctl00ContentPlaceHolder1UltraW_9fd5e9'))

WebUI.click(findTestObject('Object Repository/Page_Ingreso Equipos/input__ctl00ContentPlaceHolder1btnGuardar'))

WebUI.acceptAlert()

WebUI.verifyElementText(findTestObject('Page_Listar Equipos/span_El registro se actualiz correctamente'), 'El registro se actualizó correctamente.')

//WebUI.closeBrowser()

