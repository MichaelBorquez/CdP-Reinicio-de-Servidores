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

WebUI.navigateToUrl('http://carlo.bernucci:Aguas2021@ohioqa:4322/HomeRequerimiento.aspx')

WebUI.click(findTestObject('Object Repository/Page_Bienvenido Plataforma de Atencin de So_163357/a_Salir'))

WebUI.setText(findTestObject('Object Repository/Page_Bienvenido al Sistema Plataforma de At_4d3f8f/input_Usuario_txtUser'), 
    '2222222-8')

WebUI.click(findTestObject('Object Repository/Page_Bienvenido al Sistema Plataforma de At_4d3f8f/input_Ingrese Usuario_btnLogin'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido Plataforma de Atencin de So_163357/div_Ingrese Nueva Atencin'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido Plataforma de Atencin de So_163357/img_Cargando_pnlDatoBasico_ddlEmpresa_B-1Img'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido Plataforma de Atencin de So_163357/td_Araucana'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido Plataforma de Atencin de So_163357/img_Gerencia_pnlDatoBasico_ddlGerencia_B-1Img'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido Plataforma de Atencin de So_163357/td_Gerencia Regional - Araucana'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido Plataforma de Atencin de So_163357/img_Proceso_pnlDatoBasico_ddlProcesoN_B-1Img'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido Plataforma de Atencin de So_163357/td_Gestin de Calidad'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido Plataforma de Atencin de So_163357/img_Subproceso_pnlDatoBasico_ddlSubN_B-1Img'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido Plataforma de Atencin de So_163357/td_Administracin Psa Ara'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido Plataforma de Atencin de So_163357/img_Tipo_pnlDatoBasico_ddlTipoN_B-1Img'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido Plataforma de Atencin de So_163357/td_Atencin'))

WebUI.setText(findTestObject('Object Repository/Page_Bienvenido Plataforma de Atencin de So_163357/textarea_Descripcin_pnlDatoBasicotxtObservaciones'), 
    'Test prueba Reinicio Servidos CdP')

WebUI.click(findTestObject('Object Repository/Page_Bienvenido Plataforma de Atencin de So_163357/div_Enviar'))

WebUI.verifyElementText(findTestObject('Page_Bienvenido Plataforma de Atencin de So_163357/span_La atencin ha sido enviado correctamente'), 
    'La atención ha sido enviado correctamente.')

WebUI.closeBrowser()

