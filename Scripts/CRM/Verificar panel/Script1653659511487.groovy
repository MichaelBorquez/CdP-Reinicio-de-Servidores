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

import java.lang.Integer as Integer

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://sts.aguasnuevas.cl/adfs/ls/?wa=wsignin1.0&wtrealm=https%3a%2f%2fcrm.aguasnuevas.cl%2f&wctx=rm%3d1%26id%3d5433af67-574f-411e-b49b-50dd2b6f72b5%26ru%3dhttps%253a%252f%252fcrm.aguasnuevas.cl%252fdefault.aspx%26crmorgid%3dfdd877d0-7bde-e611-80d7-0050569b085b&wct=2022-05-27T13%3a51%3a59Z&wauth=urn%3aoasis%3anames%3atc%3aSAML%3a1.0%3aam%3apassword')

WebUI.setText(findTestObject('Object Repository/Page_Iniciar sesin/input_Inicie sesin mediante su cuenta organ_a45617'), 
    'aguas\\gonzalo figueroa')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Iniciar sesin/input_Inicie sesin mediante su cuenta organ_874196'), 
    'YaNI/ikGLCIEdUBvObImAg==')

WebUI.click(findTestObject('Object Repository/Page_Iniciar sesin/span_Iniciar sesin'))

WebUI.click(findTestObject('Page_rdenes de Trabajo Todas las Ordenes de Trabajos ltimos 6 meses - Microsoft Dynamics 365/td_Cerrar Ventana Emergente'))

WebUI.click(findTestObject('Object Repository/Page_rdenes de Trabajo Todas las Ordenes de_4e407a/span_Servicio_TabHome'))

WebUI.click(findTestObject('Object Repository/Page_rdenes de Trabajo Todas las Ordenes de_4e407a/a_Paneles'))

WebUI.click(findTestObject('Object Repository/Page_Paneles Panel General de servicio al c_732bd2/img_Panel General de servicio al cliente de_6c67d4'))

WebUI.click(findTestObject('Object Repository/Page_Paneles Trabajos del sistema - Microso_22f822/nobr_Trabajos del sistema'))

N1 = WebUI.getText(findTestObject('Object Repository/Page_Paneles Trabajos del sistema - Microso_22f822/span_20'))

number = N1.toInteger()

if(number>100) {
	assert false
}

