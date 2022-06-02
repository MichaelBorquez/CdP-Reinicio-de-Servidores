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

WebUI.navigateToUrl('https://adfs-sso2.aguasnuevas.cl/adfs/ls?wa=wsignin1.0&wtrealm=https%3a%2f%2fsins.aguasnuevas.cl%2fLogin.aspx&wctx=rm%3d0%26id%3dpassive%26ru%3d%252flogin.aspx&wct=2022-04-29T04%3a37%3a39Z')

WebUI.setText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_UserName'), '2222222-8')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_Password'), '+PXcWh3WWpMwVRuyja5I1w==')

WebUI.click(findTestObject('Object Repository/Page_Iniciar sesin/span_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/Page_Sistema de Incorporacin de Nuevos Clientes/td_Obra'))

WebUI.click(findTestObject('Object Repository/Page_Sistema de Incorporacin de Nuevos Clientes/td_Listar Obras'))

WebUI.setText(findTestObject('Object Repository/Page_Listar Obras/input_N Obra_ctl00ContentPlaceHolder1txtNumObra'), '20300')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Listar Obras/select_TodosAburto Bustamante GriseldaAcua _fd8ef3'), 
    '-1', true)

WebUI.click(findTestObject('Object Repository/Page_Listar Obras/img'))

WebUI.click(findTestObject('Object Repository/Page_Listar Obras/input_F.Digitacin Fin_ctl00ContentPlaceHold_e01211'))

WebUI.click(findTestObject('Object Repository/Page_Listar Obras/img_1'))

T1 = WebUI.getText(findTestObject('Object Repository/Page_Listar Obras/span_20300'))

WebUI.verifyEqual(T1, '20300')

T2 = WebUI.getText(findTestObject('Object Repository/Page_Listar Obras/span_Vallejos Garay Orietta Bertides'))

WebUI.click(findTestObject('Object Repository/Page_Listar Obras/a_Ver Solicitud'))

T3 = WebUI.getText(findTestObject('Object Repository/Page_Listar Obras/span_Vallejos Garay Orietta Bertides_1'))

WebUI.verifyEqual(T2, T3)

WebUI.closeBrowser()

