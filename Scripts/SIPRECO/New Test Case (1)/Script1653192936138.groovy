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

WebUI.navigateToUrl('https://adfs-sso2.aguasnuevas.cl/adfs/ls?wa=wsignin1.0&wtrealm=https%3a%2f%2fsipreco.aguasnuevas.cl%2fdefault.aspx&wctx=rm%3d0%26id%3dpassive%26ru%3d%252f&wct=2022-05-22T04%3a39%3a20Z')

WebUI.setText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_UserName'), '2222222-8')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_Password'), '+PXcWh3WWpMwVRuyja5I1w==')

WebUI.click(findTestObject('Object Repository/Page_Iniciar sesin/span_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/Page_Sistema de Presiones y Continuidad del_8279f2/div_Presiones'))

WebUI.click(findTestObject('Object Repository/Page_Sistema de Presiones y Continuidad del_8279f2/li_Administracin'))

WebUI.click(findTestObject('Object Repository/Page_Sistema de Presiones y Continuidad del_8279f2/li_Procesos'))

use (groovy.time.TimeCategory) {
	date = new Date()
	date1 = date-2.months
	
	inputMes = date1.format("MMMM")
	
	String cadenaOriginal = inputMes;
	System.out.println(cadenaOriginal);
  
	// Obtener primera letra y convertirla a mayúscula
	String primeraLetra = cadenaOriginal.substring(0, 1).toUpperCase();
	// Obtener el resto de la cadena, intacta.
	// Y convertir a minúscula
	String restoDeLaCadena = cadenaOriginal.substring(1).toLowerCase();
	// Concatenar
	String primeraMinuscula = primeraLetra + restoDeLaCadena;
	// E imprimir
	System.out.println(primeraMinuscula);
  

WebUI.setText(findTestObject('Object Repository/Page_Listar Procesos/input_Estado_ctl00ContentPlaceHolder1xgrwLi_e1e86f'),primeraMinuscula)

}

WebUI.sendKeys(findTestObject('Page_Listar Procesos/input_Estado_ctl00ContentPlaceHolder1xgrwLi_e1e86f'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Listar Procesos/input_Cancelar_ctl00ContentPlaceHolder1xgrw_79d866'))

WebUI.verifyElementText(findTestObject('Page_Listar Procesos/span_No se encontr el Archivo'), 'No se encontró el Archivo')

