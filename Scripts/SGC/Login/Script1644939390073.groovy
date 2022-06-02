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

WebUI.navigateToUrl(GlobalVariable.URL_SGC)

WebUI.setText(findTestObject('Object Repository/Page_Login  Sistema de Gestin Comercial SGC/input_Usuario_txtxUsuario'), 
    '22222222-2')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Sistema de Gestin Comercial SGC/input_Contrasea_txtxContrasena'), 
    'ABdxqtKrMrjcaniLVMqtrg==')

WebUI.click(findTestObject('Object Repository/Page_Login  Sistema de Gestin Comercial SGC/img_Empresa_xddlEmpresa_B-1Img'))

WebUI.click(findTestObject('Object Repository/Page_Login  Sistema de Gestin Comercial SGC/td_Aguas Araucana'))

WebUI.click(findTestObject('Object Repository/Page_Login  Sistema de Gestin Comercial SGC/span_Entrar'))

WebUI.verifyElementText(findTestObject('Page_Atencin de Clientes  Sistema SGC/span_Paterno_Prueba Materno_Prueba Nombres Prueba'), 
    'Paterno_Prueba Materno_Prueba Nombres Prueba')

WebUI.verifyElementText(findTestObject('Page_Atencin de Clientes  Sistema SGC/div_Men'), 'Menú')

WebUI.closeBrowser()

