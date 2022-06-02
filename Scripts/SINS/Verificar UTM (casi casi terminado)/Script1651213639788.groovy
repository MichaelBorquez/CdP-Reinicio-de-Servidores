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

WebUI.navigateToUrl('https://adfs-sso2.aguasnuevas.cl/adfs/ls?wa=wsignin1.0&wtrealm=https%3a%2f%2fsins.aguasnuevas.cl%2fLogin.aspx&wctx=rm%3d0%26id%3dpassive%26ru%3d%252flogin.aspx&wct=2022-04-29T05%3a50%3a17Z')

WebUI.setText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_UserName'), '2222222-8')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_Password'), '+PXcWh3WWpMwVRuyja5I1w==')

WebUI.click(findTestObject('Object Repository/Page_Iniciar sesin/span_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/Page_Sistema de Incorporacin de Nuevos Clientes/td_Solicitud'))

WebUI.click(findTestObject('Object Repository/Page_Sistema de Incorporacin de Nuevos Clientes/td_Listar Solicitudes'))

WebUI.click(findTestObject('Object Repository/Page_Listar Solicitudes/input_Descripcin nica_ctl00ContentPlaceHold_398e7b'))

WebUI.click(findTestObject('Page_Nueva Solicitud/input_Localidad_dijitReset dijitInputField dijitArrowButtonInnerflecha1'))

WebUI.click(findTestObject('Page_Nueva Solicitud/div_ANGOLFinal'))

WebUI.click(findTestObject('Page_Nueva Solicitud/input_Calle_dijitReset dijitInputField dijitArrowButtonInnerflecha2'))

WebUI.click(findTestObject('Page_Nueva Solicitud/div_A CANETEfinal'))

WebUI.click(findTestObject('Page_Nueva Solicitud/input_Nmero o intersec_dijitReset dijitInputField dijitArrowButtonInnerflecha3'))

WebUI.click(findTestObject('Page_Nueva Solicitud/div_LAS ACEQUIASfinal'))

WebUI.click(findTestObject('Object Repository/Page_Nueva Solicitud/div_Aceptar'))

WebUI.scrollToPosition(0, 1000)

T1 = WebUI.getText(findTestObject('Object Repository/Page_Nueva Solicitud/input_UTM X_ctl00ContentPlaceHolder1txtUtmX'), 
    FailureHandling.STOP_ON_FAILURE)

T2 = WebUI.getText(findTestObject('Object Repository/Page_Nueva Solicitud/input_UTM Y_ctl00ContentPlaceHolder1txtUtmY'), 
    FailureHandling.STOP_ON_FAILURE)

println(T1)

println(T2)

WebUI.closeBrowser()

