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

WebUI.click(findTestObject('Object Repository/Page_Bienvenido al Sistema de Produccin y D_470a8a/td_Variables'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido al Sistema de Produccin y D_470a8a/td_Administracin'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido al Sistema de Produccin y D_470a8a/td_Periodo'))

WebUI.click(findTestObject('Object Repository/Page_Listado Periodos/input_Proceso_ctl00ContentPlaceHolder1btnBuscar'))

T1 = WebUI.getText(findTestObject('Object Repository/Page_Listado Periodos/nobr_3402'))

WebUI.click(findTestObject('Page_Listado Periodos/img1'))

T2 = WebUI.getText(findTestObject('Object Repository/Page_Listado Periodos/span_3402'))

WebUI.verifyEqual(T1, T2)

T3 = WebUI.getText(findTestObject('Object Repository/Page_Listado Periodos/nobr_27612'))

WebUI.click(findTestObject('Object Repository/Page_Listado Periodos/img (1)'))

T4 = WebUI.getText(findTestObject('Object Repository/Page_Listado Periodos/span_27612'))

WebUI.click(findTestObject('Object Repository/Page_Listado Periodos/td_Datos Traza'))

WebUI.verifyEqual(T3, T4)

//WebUI.closeBrowser()

