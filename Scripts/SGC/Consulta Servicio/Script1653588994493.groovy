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

WebUI.navigateToUrl('http://sgc-araqa.aguas.local/')

WebUI.setText(findTestObject('Object Repository/Page_Login  Sistema de Gestin Comercial SGC/input_Usuario_txtxUsuario'), 
    '22222222-2')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Sistema de Gestin Comercial SGC/input_Contrasea_txtxContrasena'), 
    'ABdxqtKrMrjcaniLVMqtrg==')

WebUI.click(findTestObject('Object Repository/Page_Login  Sistema de Gestin Comercial SGC/img_Empresa_xddlEmpresa_B-1Img'))

WebUI.click(findTestObject('Object Repository/Page_Login  Sistema de Gestin Comercial SGC/td_Aguas Araucana'))

WebUI.click(findTestObject('Object Repository/Page_Login  Sistema de Gestin Comercial SGC/span_Entrar'))

WebUI.click(findTestObject('Object Repository/Page_Atencin de Clientes  Sistema SGC/div_Consulta'))

WebUI.click(findTestObject('Object Repository/Page_Atencin de Clientes  Sistema SGC/li_Nueva'))

WebUI.switchToWindowTitle('Nueva consulta')

WebUI.setText(findTestObject('Object Repository/Page_Nueva consulta/input_N Servicio_xtxtIdServicio'), '700000')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Nueva consulta/img_-_xbtnBuscarClienteImg'))

T1 = WebUI.getText(findTestObject('Object Repository/Page_Nueva consulta/input_Nombres_ASPxRoundPanel1xtxtCliente'))

T2 = WebUI.getText(findTestObject('Object Repository/Page_Nueva consulta/input_Direccin_ASPxRoundPanel1xtxtDirecion'))

WebUI.click(findTestObject('Object Repository/Page_Nueva consulta/div_Aceptar'))

WebUI.switchToWindowTitle('Atención de Clientes | Sistema SGC')

E1 = WebUI.getText(findTestObject('Object Repository/Page_Atencin de Clientes  Sistema SGC/input_-_BarraHerramientaClientextxtBHCCliente'))

E2 = WebUI.getText(findTestObject('Object Repository/Page_Atencin de Clientes  Sistema SGC/input_Direccin_xtxtDireccion'))

WebUI.verifyEqual(T1, E1)

WebUI.verifyEqual(T2, E2)

WebUI.switchToWindowTitle('Atención de Clientes | Sistema SGC')

WebUI.click(findTestObject('Page_Atencin de Clientes  Sistema SGCSpyWeb/img_-_BarraHerramientaCliente_xbtnCliOpcion1Img1'))

WebUI.switchToWindowTitle('Detalles de servicio')

WebUI.click(findTestObject('Page_Detalles de servicio/div_Registro Web1'))

WebUI.switchToWindowTitle('Direcciones de correo electrónico registrados')

//WebUI.verifyElementText(findTestObject('Page_Direcciones de correo electrnico registrados/td_rodrigo.endaragmail.com'), 
 //   'rodrigo.endara@gmail.com\t')

WebUI.verifyElementText(findTestObject('Page_Direcciones de correo electrnico registrados/td_pablo.fuentescontrerasgmail.com'), 
    'pablo.fuentescontreras@gmail.com')

//WebUI.closeBrowser()

