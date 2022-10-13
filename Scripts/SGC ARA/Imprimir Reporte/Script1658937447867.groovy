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

WebUI.click(findTestObject('Object Repository/Page_Atencin de Clientes  Sistema SGC/div_Procesos'))

WebUI.click(findTestObject('Object Repository/Page_Procesos  Sistema SGC/span_Facturacin Peridica'))

WebUI.click(findTestObject('Object Repository/Page_Procesos  Sistema SGC/div_Informes'))

WebUI.click(findTestObject('Object Repository/Page_Procesos  Sistema SGC/div_Listados de Consumo'))

WebUI.click(findTestObject('Object Repository/Page_Procesos  Sistema SGC/li_Listado de servicios con sobreconsumo'))

WebUI.switchToWindowTitle('Parámetros Para Listado De Servicios Con Sobreconsumo')

WebUI.click(findTestObject('Object Repository/Page_Parmetros Para Listado De Servicios Co_c1535a/img_Ciclo_xddlCiclo_B-1Img'))

WebUI.click(findTestObject('Object Repository/Page_Parmetros Para Listado De Servicios Co_c1535a/td_Ciclo 330- (202105)'))

WebUI.click(findTestObject('Object Repository/Page_Parmetros Para Listado De Servicios Co_c1535a/img_Desde_xrpnlLote_xddlLoteDesde_B-1Img'))

WebUI.click(findTestObject('Object Repository/Page_Parmetros Para Listado De Servicios Co_c1535a/td_Lote 1'))

WebUI.click(findTestObject('Object Repository/Page_Parmetros Para Listado De Servicios Co_c1535a/img_Hasta_xrpnlLote_xddlLoteHasta_B-1Img'))

WebUI.click(findTestObject('Object Repository/Page_Parmetros Para Listado De Servicios Co_c1535a/td_Lote 1_1'))

WebUI.click(findTestObject('Object Repository/Page_Parmetros Para Listado De Servicios Co_c1535a/div_Ver'))

WebUI.switchToWindowTitle('Listado de servicios con sobreconsumo')

WebUI.click(findTestObject('Object Repository/Page_Listado de servicios con sobreconsumo/img_Cargando_xdocView_Splitter_Toolbar_Menu_29865f'))

//WebUI.closeBrowser()

