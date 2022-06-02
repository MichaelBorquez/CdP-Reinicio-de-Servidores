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
import org.apache.commons.io.FileUtils as FileUtils
import groovy.time.TimeCategory as TimeCategory

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

WebUI.switchToWindowTitle('Procesos | Sistema SGC')

WebUI.click(findTestObject('Object Repository/Page_Procesos  Sistema SGC/div_Proceso'))

WebUI.click(findTestObject('Object Repository/Page_Procesos  Sistema SGC/li_Generacin DTE'))

WebUI.switchToWindowTitle('Generación DTE')

WebUI.click(findTestObject('Object Repository/Page_Generacin DTE/img_Ciclo_xrpnlLote_xddlCiclo_B-1Img'))

WebUI.click(findTestObject('Object Repository/Page_Generacin DTE/td_Ciclo 330- (202105)'))

WebUI.click(findTestObject('Object Repository/Page_Generacin DTE/tr_Desde                                   _022561'))

WebUI.setText(findTestObject('Object Repository/Page_Generacin DTE/input_Hasta_ASPxRoundPanel2xtxtNoDocumentoHasta'), '22687780')

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('Object Repository/Page_Generacin DTE/div_Generar'))

WebUI.click(findTestObject('Object Repository/Page_Ejecucin de Proceso/div_Ejecutar'))

WebUI.acceptAlert()

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Ejecucin de Proceso/div_Guardar DTE'))

WebUI.delay(4)

//WebUI.closeBrowser()

//obtener variable fecha
use(TimeCategory, { 
        today = new Date()
    })

todayFormat = today.format('yyyy-MM')

File Archivo = new File(('C:\\Users\\csala\\Downloads\\AA-' + todayFormat) + '-01-39.txt')

String texto = FileUtils.readFileToString(Archivo)

System.out.println(texto)

