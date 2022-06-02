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

WebUI.navigateToUrl('https://adfs-sso2.aguasnuevas.cl/adfs/ls?wa=wsignin1.0&wtrealm=https%3a%2f%2fsipreco.aguasnuevas.cl%2fdefault.aspx&wctx=rm%3d0%26id%3dpassive%26ru%3d%252f&wct=2022-05-20T15%3a47%3a34Z')

WebUI.setText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_UserName'), '2222222-8')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_Password'), '+PXcWh3WWpMwVRuyja5I1w==')

WebUI.click(findTestObject('Object Repository/Page_Iniciar sesin/span_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/Page_Sistema de Presiones y Continuidad del_8279f2/div_Reclamos'))

WebUI.click(findTestObject('Object Repository/Page_Sistema de Presiones y Continuidad del_8279f2/li_Administracin'))

WebUI.click(findTestObject('Object Repository/Page_Sistema de Presiones y Continuidad del_8279f2/li_Listar'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido al Sistema de Presiones y C_35431c/img'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido al Sistema de Presiones y C_35431c/span_Cerrar'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido al Sistema de Presiones y C_35431c/img_1'))

if(N1<100) {
	assert false
}

WebUI.verifyElementText(findTestObject('Page_Bienvenido al Sistema de Presiones y C_35431c/b_Pgina 1 de 207 (2062 elementos)'), 
    'Página 1 de 207 ('+N1+' elementos)')

WebUI.closeBrowser()

